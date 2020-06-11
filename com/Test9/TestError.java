//20年5月6日课堂代码
package com.Test9;

public class TestError {
    public static void main(String[] args) {
        //java.lang.StackOverflowError 栈溢出
        main(args);
        //java.lang.OutOfMemoryError 堆空间溢出
        byte[]b=new byte[1024*10240*1024*10240];
    }
}
