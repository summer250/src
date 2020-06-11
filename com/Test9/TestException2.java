//20年5月13日课堂代码
package com.Test9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的方式二：在方法的声明处，显式的抛出该异常对象的类型。
 * 格式：public static void method1() throws FileNotFoundException, IOException {}
 * 当在此方法内部出现异常的时候，会抛出一个异常类的对象给方法的调用者。
 * 异常的对象可以逐层的向上抛，直至main中。当然在向上抛的过程中，可以再通过try-catch-finally进行处理。
 *
 * java的异常处理：抓抛模型
 * 1.抓：异常的处理，有两种方式（try-catch-finally)和（throws+异常的类型）
 * 2.抛：一旦执行过程中，出现异常，会抛出一个异常类的对象。
 *  （自动抛出 VS 手动抛出(throw+异常类对象）
 *     >异常类，即可以是现成的异常类，也可以是自己创建的异常类。
 */
public class TestException2 {
    public static void main(String[] args) {
        try {
            method2();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method3(){
        try {
            method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws FileNotFoundException, IOException {
        method1();
    }

    public static void method1() throws FileNotFoundException, IOException {
        File file;
        FileInputStream fis=new FileInputStream(new File("hello1.txt"));
        int b;
        while ((b=fis.read()) !=-1){
            System.out.println((char)b);
        }
        fis.close();
    }
}
