////20年4月29日课堂代码
package com.Test9;

/**
 * 类的第五个成员:内部类
 * 1.相当于说,我们可以在类的内部再定义类.外面的类:外部类.里面定义的类:内部类
 * 2.内部类的分类:成员内部类(声明在类的内部且方法外)vs局部内部类(声明在类的方法里)
 * 3.成员内部类
 *       3.1 是外部类的一个成员:1)可以有4个修饰符
 *                            2)static,final
 *                            3)内部类可以调用外部类的方法,属性
 *
 *       3.2 具有类的特点:1)abstract
 *       2)还可以在其内部定义属性,方法,构造器
 * 4.局部内部类
 * 5.关于内部类,大家掌握三点:
 *  1)如何创建成员内部类的对象(非静态内部类 VS 静态内部类)
 *  2)如何区分调用外部类,内部类的变量,(尤其是变量重名时)
 * 6.局部内部类(见TestInnerClass1)
 *
 */
public class TestInnerClass {
    public static void main(String[] args) {
        //如何创建静态内部类的对象,可以直接用外部类调用静态内部类的构造器
        Person.Dog d=new Person.Dog();
        //创建非静态内部类的对象:必须先创建外部类的对象,通过外部类的对象调用内部类的构造器
//        Person.Bird b=new Person.Bird();
        Person p=new Person();
        Person.Bird b=p.new Bird();//new P.Bird();
        b.info();
        b.setName("杜鹃");
    }
}
class Person{
    String name="梦梦";
    int age;

    //成员内部类(非static的)
    class Bird{
        String name="黄鹂";
        int age;

        public Bird(){

        }
        public void setName(String name){//name="杜鹃";
            System.out.println(name);//杜鹃
            System.out.println(this.name);//黄鹂
            System.out.println(Person.this.name);//梦梦
        }
        public void info(){
            show();
        }
    }

    public void method1(){
        //局部内部类
        class A{

        }
    }
    //成员内部类(静态内部类)
    static class Dog{

    }
    public void show(){
        System.out.println("我是show()方法");
    }
}
