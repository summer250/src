//20年4月22日课堂代码
package com.Test8;

/**
 * 接口(interface)是与类并行的概念
 * 1.接口可以看作是一个特殊的抽象类.是常量与抽象方法的一个集合,不能包含变量,一般方法.
 * 2.接口是没有构造器的
 * 3.接口定义的就是一种功能,此功能可以被类所实现(implements)
 *   比如:class CC extends DD implements AA
 * 4.实现接口的类,必须要重写其中所有的抽象方法.方可实例化.
 *   若没有重写所有的抽象方法,则此类仍为一个抽象类
 * 5.类可以实现多个接口-----java中类的继承是单继承的.
 * 6.接口与接口之间也是继承关系,而且可以实现多继承.
 *
 */
public class TestInterface {
    public static void main(String[] args) {
        System.out.println(AA.I);//说明static
//        AA.I=13;//无法赋值
    }
}
interface AA{
    //常量:所有的常量都用public static final修饰的.
    //public static final int I=12;
    int I=12;
//    int i;
//    public static final boolean FLAG=false;
    boolean FLAG=false;
    //抽象方法:所有都用public abstract修饰
//    public abstract void method1();
    void method1();
//    public abstract void method2();
    void method2();
//    public void method3(){
//
//    }
}
abstract class BB implements AA{

}
class DD {

}
interface MM{
    void method3();
}
class CC extends DD implements AA,MM{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
//接口之间为继承关系
interface JJ extends MM,AA{
    void method4();
}

class GG implements JJ {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }
}