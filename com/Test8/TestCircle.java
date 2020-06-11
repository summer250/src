//20年4月28日课堂练习
package com.Test8;

public class TestCircle {
    public static void main(String[] args) {
        ComparableCircle c1=new ComparableCircle(2.3);
        ComparableCircle c2=new ComparableCircle(2.1);
        ComparableCircle c3=new ComparableCircle(2.3);

        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(c3));
        System.out.println(c2.compareTo(c3));
        System.out.println(c1.compareTo(new String()));
    }
}
interface CompareObject{
    public int compareTo(Object o);
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
}
class Circle{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }else if (o instanceof ComparableCircle){
            ComparableCircle c=(ComparableCircle) o;
            if (this.getRadius()>c.getRadius()){
                return 1;
            }else if (this.getRadius()<c.getRadius()){
                return -1;
            }else {
                return 0;
            }
        }else{
            throw new RuntimeException("传入的非ComparableCircle的对象,不可进行比较");
        }
    }
}
