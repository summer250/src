//3月25日课堂练习
package com.Test5;

//请根据以下代码自行定义能满足需要的MyDate类,在MyDate类中覆盖equals方法，
// 使其判断当两个MyDate类型对象的年月日都相同时，结果为true，否则为false。
//public boolean equals(Object o)

import java.util.Objects;

public class TestEquals1 {
    public static void main(String[] args) {
        MyData m1 = new MyData(14, 3, 1976);
        MyData m2 = new MyData(14, 3, 1976);

        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); //m1 != m2
        }

        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");
            // m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }
    }
}
 class MyData{
    int day;
    int month;
    int year;

    public MyData(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return day == myData.day &&
                month == myData.month &&
                year == myData.year;
    }

}
