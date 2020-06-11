//3月24日课堂代码
package com.Test5;

public class TestEquals {
    public static void main(String[] args) {
//        TestEquals t=new TestEquals();
//        t.test1();
        //equals():1.只能处理引用类型的变量
        //              ctrl+shift+t  看源码 idea(ctrl+h)
        /*
        public boolean equals(Object obj) {
            return (this == obj);
        }
         */
        //2.在Object类中，发现equals()依然比较的两个引用变量的地址值是否相同
        //java.lang.Object类，是所有类的根父类
        Person p1=new Person();
        Person p2=new Person();
        System.out.println(p1.equals(p2));//false---->true
        System.out.println(p1==p2);//false
        //像String、包装类、File类、Date类，这些类重写了Object类的equals方法，比较的是两个对象的“实体内容”是否相同
        // ctrl+o   idea(alt+7)    快速定位属性、构造器、方法
        String str1=new String("AA");
        String str2=new String("AA");
        System.out.println(str1=str2);//false
        System.out.println(str1.equals(str2));//

    }
    public void test1(){
        //==
        //1.基本数据类型：根据基本数据类型的值判断是否相等。相等返回true，反之返回false
        //  注：两端的数据类型可以不同，在不同情况下，也可以返回true。
        //2.引用数据类型：比较的是引用变量类型的地址值是否相等。
        int i=12;
        int j=12;
        System.out.println(i == j);//true
        char c=12;
        System.out.println(i == c);//true
        float f=12.0f;
        System.out.println(i == f);//true
        int k=65;
        char a='A';
        System.out.println(k == a);//true

        Object obj1=new Object();
        Object obj2=new Object();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);//false

        Person p1=new Person();
        Person p2=new Person();
        Person p3=p1;
        System.out.println(p1 == p2);//false
        System.out.println(p1 == p3);//true
    }
}


