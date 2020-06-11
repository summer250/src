//20年5月13日课堂代码
package com.Test9;
/**
 * 如何自定义一个异常类：
 * 1.自定义一个的异常类继承现有的异常类
 * 2.提供一个序列号，提供交给重载的构造器
 *
 */
public class MyException extends Exception {

    static final long serialVersionUID = -7034897190745766939L;
    //构造器
    public MyException(){
        super();
    }
    public MyException(String msg) {
        super(msg);
    }
}
