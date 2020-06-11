//20年6月3日课外作业
package com.Test11;


import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class TestEmployee {
    //定制排序
    @Test
    public void test2(){
        Comparator com=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee1) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    MyDate birth1 = e1.getBirthday();
                    MyDate birth2 = e2.getBirthday();

                    if (birth1.getYear() != birth2.getYear()) {
                        return birth1.getYear() - birth2.getYear();
                    } else {
                        if (birth1.getMonth() != birth2.getMonth()) {
                            return birth1.getMonth() - birth2.getMonth();
                        } else {
                            return birth1.getDay() - birth2.getDay();
                        }
                    }
                }

                return 5;
            }
        };
        TreeSet set=new TreeSet(com);
        Employee1 e1=new Employee1("岛市老八",43,new MyDate(3,7,1987));
        Employee1 e2=new Employee1("哈拉少",45,new MyDate(3,5,1994));
        Employee1 e3=new Employee1("冬泳怪鸽",48,new MyDate(9,2,1994));
        Employee1 e4=new Employee1("药水哥",37,new MyDate(28,5,1994));
        Employee1 e5=new Employee1("川建国",34,new MyDate(8,1,1965));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
    //自然排序
    @Test
    public void test1(){
        Employee e1=new Employee("岛市老八",43,new MyDate(3,7,1987));
        Employee e2=new Employee("哈拉少",32,new MyDate(24,5,1994));
        Employee e3=new Employee("冬泳怪鸽",48,new MyDate(9,2,1971));
        Employee e4=new Employee("药水哥",37,new MyDate(28,10,1981));
        Employee e5=new Employee("川建国",34,new MyDate(8,1,1965));
//        Employee e6=new Employee("川建国",32,new MyDate(7,3,1968));

        TreeSet set = new TreeSet();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
//        set.add(e6);

        Iterator i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}

class Employee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee e=(Employee)o;
            return this.name.compareTo(e.name);
        }
        return 0;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
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
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day &&
                month == myDate.month &&
                year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}

class Employee1{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee1() {
    }

    public Employee1(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return age == employee1.age &&
                Objects.equals(name, employee1.name) &&
                Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }
}