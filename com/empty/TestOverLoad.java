package com.empty;

/**
 * 方法的重载（overload）
 * 要求：1.同一个类中
 * 2.方法名相同
 * 3.方法的参数列表不同（a.参数的个数不同 b.参数的类型不同）
 * 补充：方法的重载与方法的返回值类型没有关系
 */
public class TestOverLoad {
}
class OverLoad{
    //定义两个 int 型变量的和
    public int getSum(int i,int j) {
        return i+j;
    }
    //定义三个 int 型变量的和
    public int getSum(int i ,int j,int k) {
        return i+j+k;
    }
    //不能与其它几个方法构成重载
// public int getSum1(int i ,int j,int k) {
// return i+j+k;
// }
// public void getSum(int i ,int j,int k) {
// System.out.println(i+j+k);
// }
//定义两个 double 类型数据的和
    public double getSum(double d1,double d2) {
        return d1+d2;
    }
    //定义三个 double 型数据的 和
    public void getSum(double d1,double d2,double d3) {
        System.out.println(d1+d2+d3);
    }
    //以下的两个方法构成重载
    public void method1(int i,String str) {
    }
    public void method1(String str,int j) {
    }
}
/**
 * 构造器重载
 *  构造器一般用来创建对象的同时初始化对象。如
 * class Person{
 *      String name;
 *      int age;
 *      public Person(String n , int a){ name=n; age=a;}
 * }
 *  构造器重载使得对象的创建更加灵活，方便创建各种不同
 * 的对象。
 * 构造器重载举个例子：
 * public class Person{
 *          public Person(String name, int age, Date d) {this(name,age);…}
 *          public Person(String name, int age) {…}
 *          public Person(String name, Date d) {…}
 *          public Person(){…}
 * }
 *  构造器重载，参数列表必须不同
 */
