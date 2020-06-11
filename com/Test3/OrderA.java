//20年3月5日课堂代码
package com.Test3;

public class OrderA {
    public static void main(String[] args) {
        Order o = new Order();
        //o.oderName;private 不能调用
        o.orderDesc=null;
        o.oderNum=1;
        o.orderId=100;
    }
}
