//20年2月26日课外作业
//20年3月5日课外作业
package com.Test2;

public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        this.length=1;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    //重写父类Circle,求圆柱的表面积
    public double findArea(){
        return Math.PI*getRadius()*getRadius()*2+Math.PI*2*getRadius()*getLength();
    }
    //圆柱的体积
    public double findVolume(){
        return Math.PI*getRadius()*getRadius()*length;
    }
}
