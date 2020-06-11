//3月25日课外作业
package com.Test5;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        radius=1.0;
    }
    public Circle(double radius) {
        super.color="white";
        this.radius=1.0;
        this.radius = radius;
    }
    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }

    @Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Circle circle = (Circle) o;
    return Double.compare(circle.radius, radius) == 0;
}

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
