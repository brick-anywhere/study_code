package com.dll.design.demo.singleton;

import com.dll.design.demo.adapterpattern.AudioPlayer;
import org.junit.Test;

/**
 * 适配器模式：
 * 这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 * 这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。
 * 举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。您将内存卡插入读卡器，
 * 再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡。
 *
 * 主要解决：
 *   主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
 * 优点：
 *   1、可以让任何两个没有关联的类一起运行。 2、提高了类的复用。 3、增加了类的透明度。 4、灵活性好。
 * 缺点：
 *   1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现
 *   ，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。
 *   2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。
 *使用场景：
 *   有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式。
 *注意事项：
 *    适配器不是在详细设计时添加的，而是解决正在服役的项目的问题。
 * @author dll
 * @date 2021-05-17 17:14
 */
public class AdapterPatternDemo {
    @Test
    public void fun(){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    };
}
