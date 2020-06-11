//20年5月13日课堂代码
package com.Test9;

/**
 * 1.手动的抛出一个异常的例子
 * 2.抛出的异常类型，若是RuntimeException,可以不显式的处理。
 *                 若是Exception，必须要显式的处理。
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.1);
        Circle c2 = new Circle(2.1);
        try {
            System.out.println(c1.compareTo(c2));//0
            System.out.println(c1.compareTo(new String("AA")));
        } catch (Exception e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
class Circle{
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //比较两个圆的半径的大小
    public int compareTo(Object obj) throws Exception {
        if (this == obj){
            return 0;
        }else if (obj instanceof Circle){
            Circle c=(Circle) obj;
            if (this.radius > c.radius){
                return 1;
            }else if (this.radius == c.radius){
                return 0;
            }else {
                return -1;
            }
        }else {
//            return -2;
            //手动抛出一个异常
//            throw new RuntimeException("传入的类型有误！");
//            throw new String("传入的类型有误！");  错误的，必须是Exception下的异常
            //手动抛出一个自定义异常
            throw new MyException("传入的类型有误！");
        }
    }
}