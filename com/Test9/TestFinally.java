//20年5月12日课堂代码
package com.Test9;

public class TestFinally {
    public static void main(String[] args) {
        int i=method1();
        System.out.println(i);

    }

    public static int method1(){
        try{
            System.out.println(10/0);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 3;
        }finally {
            System.out.println("我是帅哥！");
//            return 2;
        }
    }
}

