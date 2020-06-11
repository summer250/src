package com.empty;

/**
 * 面向对象特征之一：封装和隐藏
 *      使用者对类内部定义的属性（对象的成员变量）的直接操作会导致数据的错误、混乱或安全性问题，这时候就需要封装和隐藏
 *    问题：当创建了类的对象以后，如果直接通过“对象.属性”的方式对相应的对象属性赋值的话，可能会出现不满足实际情况的意外，
 *           我们考虑不让对象来直接作用属性，而是通过“对象.方法”的形式，来控制对象对属性的访问，实际情况中，
 *           对属性的要求就可以通过方法来实现。
 *    解决的方法：（封装性的思想）
 *            1.将类的属性私有化
 *            2.提供公共的方法（setter && getter）来实现调用
 */
public class TestPackaging {

}
class Animals{
    //private 修饰的属性只能在本类中调用，出了此类，就不能被调用了
    private String name;//动物的名字
    private int legs;//腿的个数

    public void eat(){
        System.out.println("动物进食");
    }
    public void sleep(){
        System.out.println("动物睡觉");
    }
    public void info() {
        System.out.println("name:"+name+" legs:"+legs);
    }
    //设置类的属性
    public void setLegs(int l) {
        if(l>0 && l%2==0) {
            legs=1;
        }else {
            System.out.println("您输入的数据有误！");
        }
    }
    //获取类的属性
    public int getLegs() {
        return legs;
    }
    // public int doLegs(int l) {
    // legs=l;
    // return legs;
    // }
    public void setName(String n) {
    //...
        name=n;
    }
    public String getName() {
        return name;
    }
}

/**
 * 四种访问权限修饰符
 * Java权限修饰符public、protected、private置于类的成员定义前，用来限定对象对该类成员的访问权限
 *  对于class的权限修饰只可以用public和default(缺省)。
 *      public类可以在任意地方被访问。
 *      default类只可以被同一个包内部的类访问
 *
 */
