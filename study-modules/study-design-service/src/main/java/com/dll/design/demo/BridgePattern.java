package com.dll.design.demo;

import com.dll.design.demo.bridgepattern.Circle;
import com.dll.design.demo.bridgepattern.GreenCircle;
import com.dll.design.demo.bridgepattern.RedCircle;
import com.dll.design.demo.bridgepattern.Shape;
import org.junit.jupiter.api.Test;

/**
 * 桥接模式：
 *   桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
 *   这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 * 意图：
 *  将抽象部分与实现部分分离，使它们都可以独立的变化。
 *主要解决：
 *  在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
 *何时使用：
 *    实现系统可能有多个角度分类，每一种角度都可能变化。
 *如何解决：
 *    把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。
 * 关键代码：
 *    抽象类依赖实现类。
 * 优点：
 *   1、抽象和实现的分离。 2、优秀的扩展能力。 3、实现细节对客户透明。
 * 缺点：
 *   桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 * 使用场景：
 *   1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，
 *   通过桥接模式可以使它们在抽象层建立一个关联关系。
 *   2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
 *   3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 * 注意事项：
 *   对于两个独立变化的维度，使用桥接模式再适合不过了。
 * @author dll
 * @date 2021-05-19 11:04
 */
public class BridgePattern {

    @Test
    public void fun1() {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
