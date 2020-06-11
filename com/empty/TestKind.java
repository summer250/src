package com.empty;

/**
 *   本来今天是想写数组，最近老蒋才讲完集合，那就留着数组和集合以及数组的遍历一起写，先写面向对象
 *
 *   先记住这3点，面试会提问，考试会考
 *   1.java的特点：封装、继承、多态
 *   2.java语言的基本元素：类和对象
 *   3.类的三个成员：属性、方法、构造器
 *
 *   类（class）和对象（object）是面向对象的核心概念
 *      1.类是对一类事物描述，是抽象的、概念上的定义
 *      2.对象是实际存在的该类事物的每个个体，因而也称实例（instance）
 *      3.面向对象的思想概述：万事万物皆对象
 *
 *   举个例子：
 *   public class TestKind{
 *       public static void main(String[] args) {    //  这是主方法，程序的唯一入口，如果一段代码有多个方法，多个类，
 *                                                   // main方法后面的才是执行语句，期末考试的读程序写结果，第一眼找到main方法
 *                                                   // 然后往下分析是关键
 *
 *           Person p=new Person();     //这是创建对象 就是通常所说的实例化
 *       }
 *   }
 *
 *   //创建一个类
 *   class Person{
 *
 *   }
 *
 *
 *
 *
 *   类的语法格式：
 *   修饰符 class 类名{
 *       属性声明；
 *       方法声明；
 *   }
 *PS：修饰符public：类可以被任意访问
 *    类的正文要用{}括起来
 *
 *
 * 举个例子
 * public class Person{
 *     private int age;                 //声明私有变量age
 *     public void showAge(int i){     //声明方法showAge()
 *         age=i;
 *     }
 * }
 *
 *
 */
public class TestKind {
}

