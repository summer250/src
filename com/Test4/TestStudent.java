//20年3月12日课堂代码
package com.Test4;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        s.info();
        Student s1 = new Student("江苏海院");
        System.out.println(s1.getName()+"，"+s1.getAge()+"，"+s1.getSchoolName());
    }
}
