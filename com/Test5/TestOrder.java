//3月24日课堂代码
package com.Test5;

import java.util.Objects;

public class TestOrder {
    public static void main(String[] args) {
     Order o1=new Order(1001,"AA");
     Order o2=new Order(1001,"AA");
     System.out.println(o1==o2);//false
     System.out.println(o1.equals(o2));//false
    }
}
class Order{
    private int OrderId;
    private String OrderName;

    public Order(int orderId, String orderName) {
        OrderId = orderId;
        OrderName = orderName;
    }

    public int getOrderId() {
        return OrderId;
    }
    public void setOrderId(int orderId) {
        OrderId = orderId;
    }
    public String getOrderName() {
        return OrderName;
    }
    public void setOrderName(String orderName) {
        OrderName = orderName;
    }
    //比较两个Order对象的属性是否完全相同，相同的话，返回true
//    public boolean equals(Object obj){
//        if (this==obj){
//            return true;
//        }else if (obj instanceof Order){
//            Order o1=(Order)obj;
//            return this.OrderId==o1.OrderId && this.OrderName.equals(o1.OrderName);
//        }else {
//            return false;
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return OrderId == order.OrderId &&
                Objects.equals(OrderName, order.OrderName);
    }
}