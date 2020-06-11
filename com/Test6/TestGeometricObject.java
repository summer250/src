//3月18日课外作业
package com.Test6;

public class TestGeometricObject {
    public static void main(String[] args) {
        TestGeometricObject t = new TestGeometricObject();

        Circle c1 = new Circle("无",0,2);
        Circle c2 = new Circle("无",0,2);
        MyRectangle m1 = new MyRectangle("无",0,2,2);

        boolean b=t.equalsAre(m1,c1);
        System.out.println(b);

        t.displayGeometricObject(c1);
    }

    public boolean equalsAre(GeometricObject g1,GeometricObject g2){
        if (g1.findArea()==g2.findArea()){
            return true;
        }else {
            return false;
        }
    }

    public void displayGeometricObject(GeometricObject g){
        System.out.println(g.findArea());
    }
}
