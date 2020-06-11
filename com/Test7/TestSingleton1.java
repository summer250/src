//20年4月8日课堂代码
package com.Test7;
//懒汉式
public class TestSingleton1 {
    public static void main(String[] args) {
        Singleton1 s1=Singleton1.getSingleton1();
        Singleton1 s2=Singleton1.getSingleton1();
        System.out.println(s1==s2);
    }
}
class Singleton1{
    //1.
    private Singleton1(){

    }
    //2.
    private static Singleton1 instance=null;
    //3.
    public static Singleton1 getSingleton1() {
        if (instance==null){
            instance=new Singleton1();
        }
        return instance;
    }
}
