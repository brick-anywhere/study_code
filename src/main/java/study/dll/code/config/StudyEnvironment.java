package study.dll.code.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.StandardServletEnvironment;
import study.dll.code.common.LogUtil;
import study.dll.code.utils.StudyApplicationContextUtil;

/**
 * @author
 * @version 1.0.0
 * @date 2020-07-06 10:22
 */
@Order(0)
@Component
public class StudyEnvironment implements Environment, CommandLineRunner {

    private static String environment;

    @Value("${spring.profiles.active}")
    public void setEnvironment(String environment) {

        StudyEnvironment.environment = environment;
    }

    private static String applicationName;

    @Value("${spring.application.name}")
    public void setApplicationName(String applicationName) {
        StudyEnvironment.applicationName = applicationName;
    }


    public static String getEnvironment() {
        return environment;
    }

    public static String getApplicationName() {
        return applicationName;
    }

    public static boolean isProductEnvironment() {
        return isSxOrKsEnvironment();
    }

    public static boolean isSxOrKsEnvironment() {
        return "pro".equals(environment);
    }

    @Override
    public void run(String... args) {
        org.springframework.core.env.Environment bean = StudyApplicationContextUtil.getBean(org.springframework.core.env.Environment.class);
        LogUtil.info("✈✿➹▓▓▓▓▓▓▓▓系统启动....................▓▓▓▓▓▓▓▓▓");
        LogUtil.info("可用处理器连接数: ✿✿✿✿✿✿ {} ✿✿✿✿✿✿", Runtime.getRuntime().availableProcessors());
        LogUtil.info("JVM内存信息情况: ✿✿✿✿✿✿ totalMemory:{}  maxMemory:{}  freeMemory:{} ✿✿✿✿✿✿"
                , Runtime.getRuntime().totalMemory(), Runtime.getRuntime().maxMemory(), Runtime.getRuntime().freeMemory());
        LogUtil.info("获取到启动环境: ✿✿✿✿✿✿ {} ✿✿✿✿✿✿", StudyEnvironment.environment);
        LogUtil.info("获取到启动工程: ✿✿✿✿✿✿ {} ✿✿✿✿✿✿", applicationName);
        MutablePropertySources propertySources = null;
        try {
            propertySources = ((StandardServletEnvironment) bean).getPropertySources();
            LogUtil.info("服务的操作系统: ✿✿✿✿✿✿ {} ✿✿✿✿✿✿", ((StandardServletEnvironment) bean).getSystemProperties().get("os.name"));
            for (PropertySource<?> source : propertySources) {
                if (source instanceof OriginTrackedMapPropertySource) {
                    LogUtil.info("加载的配置文件: ✿✿✿✿✿✿ {} ✿✿✿✿✿✿", source.getName());
                }
                if (source instanceof MapPropertySource) {
                    MapPropertySource mps = (MapPropertySource) source;
                    if ("server.ports".equals(mps.getName())) {
                        LogUtil.info("项目的端口信息: ✿✿✿✿✿✿ {} ✿✿✿✿✿✿", source.getSource());
                    }
                    if ("springCloudClientHostInfo".equals(mps.getName())) {
                        LogUtil.info("Cloud配置信息: ✿✿✿✿✿✿ {} ✿✿✿✿✿✿", source.getSource());
                    }
                }
            }
        } catch (Exception e) {
            if (e instanceof ClassCastException) {
                return;
            }
            LogUtil.error("获取系统参数异常：{}", e);
        }

    }


}
