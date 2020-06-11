//20年4月1日课堂代码
//20年4月7日课堂代码
package com.Test7;
/**
 * static,静态的，可以用来修饰属性、方法、*代码块（初始化块）、*内部类
 *
 * static修饰属性（类变量）
 * 1.由类创建的所有对象，都共用着一个属性。
 * 2.当其中一个对象对此属性进行修改，会导致其他对象对此属性的一个调用。
 *    vs 实例变量（非static修饰的属性，各个对象各自拥有一套副本）
 * 3.类变量随着类的加载而加载的，而且独一份。
 * 4.静态的变量可以通过“类.类变量”的形式来调用的。
 * 5.类变量的加载是要早于对象。所以当有对象以后，可以“对象.类变量”使用，但是“类.实例变量”是不行的
 * 6.类变量存在于静态域中。
 *
 * static修饰方法（类方法）
 * 1.随着类的加载而加载，在内存中独一份。
 * 2.可以直接通过“类.类方法”的方式调用。
 * 3.静态方法的内部可以调用静态的属性或静态的方法。
 *   而不能调用非静态的属性或方法。
 *   >>静态的方法内是不可以有this或super关键字的。
 *
 * 注：静态的结构（static的属性、方法、代码块、内部类）的声明周期要早于非静态的结构
 *     同时被回收要晚于非静态的结构。
 * */
public class TestSportsMan {
    public static void main(String[] args) {
        SportsMan s1=new SportsMan("金龙",24);
        SportsMan s2=new SportsMan("银龙",21);
        s1.name="花龙";
        s1.nation="China";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(SportsMan.nation);//类.类变量
//      System.out.println(SportsMan.name);//错误的
        s1.show1();
        SportsMan.show();
//      SportsMan.show1();
    }
}
class SportsMan{
    String name;
    int age;
    //类变量
    static String nation;//国籍

    public SportsMan(String name, int age) {
        this.name = name;
        this.age = age;
        this.nation="中国";//构造器里也可以调用静态属性
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
    @Override
        public String toString() {
            return "SportsMan{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", nation='" + nation + '\'' +
                    '}';
    }

    public void show1(){
        System.out.println("age:"+this.age);
        System.out.println("nation:"+nation);
        System.out.println("我是一个来自于中国的运动员。");
    }
    //类方法
    public static void show(){
//      System.out.println("age:"+this.age);
        System.out.println("nation:"+nation);
        info();
        System.out.println("我是一个来自于China的运动员。");
    }
    public static void info(){
        System.out.println("我是静态的方法！");
    }

}
