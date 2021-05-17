package com.dll.design.demo.prototypepattern;

/**
 * Cloneable：
 * cloneable其实就是一个标记接口，只有实现这个接口后，然后在类中重写Object中的clone方法，
 * 然后通过类调用clone方法才能克隆成功，如果不实现这个接口，则会抛出CloneNotSupportedException(克隆不被支持)异常。Object中clone方法：
 *
 * 抽象类：
 * 1. 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。
 * 2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
 * 3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。
 * 4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
 * 5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
 *
 * @author dll
 * @date 2021-05-10 14:19
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
