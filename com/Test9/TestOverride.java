//20年5月13日课外作业
package com.Test9;

import java.io.FileNotFoundException;
import java.io.IOException;
//子类重写的父类的方法，其抛出的异常类型只能是被重写的方法的异常类的子类或异常类一样
public class TestOverride {
    public static void main(String[] args) {
        A a=new B();
        try {
            a.method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class A{
    public void method1() throws IOException{

    }
}

class B extends  A{
    public void method1() throws FileNotFoundException{

    }
}