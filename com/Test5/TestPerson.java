//3月17日课堂代码
//3月18日课堂代码
package com.Test5;
/*
 * 面向对象的第三个特征：多态性
 * 1.多态性指的是什么？多态性，可以理解为一个事物的多种表现形态。
 *      1）方法的重载和重写
 *      2）子类对象的多态性
 * 2.子类对象的多态性使用的前提：
 *      1）要有类的继承。
 *      2）要有子类对父类方法的重写。
 * 3.程序运行分为编译状态和运行时状态。
 *      对于多态性来说，编译时，“看左边”，将此引用变量理解为父类的类型
 *      运行时，“看右边”，关注的是真正的对象的实体，子类的对象。那么执行的方法就是子类重写。
 * 4.子类对象的多态性，并不适用属性。
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        p.walk();

        Man m =new Man();
        m.eat();
        m.walk();
        System.out.println("*************");
        //子类对象的多态性：父类的引用指向子类的对象
        Person p1 = new Man();//向上转型
        //虚拟方法调用：通过父类的引用指向子类对象实体，当调用方法时执行的是子类重写的方法。
        p1.walk();
        p1.eat();
        System.out.println("$"+p1.id);

//        p1.entertainment();
        System.out.println("*************");
        Person p2 = new Woman();
        p2.walk();
        p2.eat();
//        p2.shopping();

        Woman w=(Woman)p2;//向下转型，使用强制转换符（）
        w.shopping();
        System.out.println("*************");

        //java.lang.ClassCastException 编译时没错，运行时报错
//        Woman w1=(Woman)p1;
//        w1.shopping();

//        Woman w2= (Woman)new Man();//编译时报错

        //instanceof
        //格式：对象 instanceof 类A
        //判断对象是否是类A的一个实例，是的话，返回true，否则返回false
        //若a是A类的实例，那么a也一定是A类的父类的实例
        if (p1 instanceof Woman) {
            Woman W1 = (Woman) p1;
            W1.shopping();
        }
        if (p1 instanceof Man) {
            Man m1 = (Man) p1;
            m1.entertainment();
        }

        if (p1 instanceof Person) {
            System.out.println("你好！");
        }

//        public void show(Person p){//Person p = new Man();
//
//        }
//        public void show(Man p){
//
//        }
//        public void show(Woman p){
//
//        }
    }
}

