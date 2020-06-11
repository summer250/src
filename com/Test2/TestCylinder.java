//20年2月26日课外作业
//20年3月5日课外作业
package com.Test2;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder Cylinder=new Cylinder();

        Cylinder.setRadius(2);
        Cylinder.setLength(2);

        System.out.println("Volume:"+Cylinder.findVolume());
        System.out.println("Area:"+Cylinder.findArea());

    }
}
