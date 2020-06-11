//20年3月31日课堂代码
package com.Test7;
/**
 * Junit单元测试类
 * 1.当前工程下-->右键build path-->add libraries --Junit5(最新版本即可）
 * 2.在主类中，创建一个空参的无返回值的方法，如（public void test1())用于代码的测验，方法上声明：@Test
 * 3.导入import org.junit.jupiter.Test;
 * 4.在test1()方法中，进行代码的编写和测试。
 * 5.测试：双击方法名，右键run as -->Junit
 */

import org.junit.jupiter.api.Test;

public class TestJunit {
    public static void main(String[] args) {
//        String str="AA";
//        System.out.println(str);
    }

    @Test
    public void test2(){

    }

    @Test
    public void test1(){
        String str="AA";
        System.out.println(str);
        m1();
    }
    public void m1(){
        System.out.println("hello world");
    }
}
