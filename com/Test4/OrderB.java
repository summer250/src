//20年3月5日课堂代码
package com.Test4;

import com.Test3.Order;

public class OrderB {
    public static void main(String[] args) {
        Order o = new Order();
        o.orderDesc=null;
    }
}
class Order1 extends Order{
    public void method5(){
        oderNum=1002;
        method3();
        //method2(); default 权限看不见
    }
}
