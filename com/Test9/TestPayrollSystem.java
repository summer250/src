//20年4月28日课外作业
package com.Test9;

import java.util.Scanner;

public class TestPayrollSystem {
    public static void main(String[] args) {
        Employee[] emp=new Employee[2];
        emp[0]=new SalariedEmployee("小明",1001,new MyDate(2000,01,12),8000);

        emp[1]=new HourlyEmployee("小李",1002,new MyDate(2001,02,24),100,6);

        Scanner s=new Scanner(System.in);
        System.out.println("请输入本月的月份:");
        int month = s.nextInt();

        for (int i=0;i<emp.length;i++){
            if (month == emp[i].getBirthday().getMonth()){
                System.out.println();
                System.out.println("加100元工资:");
            }
            System.out.println(emp[i]);
        }
    }
}

//雇员信息
abstract class Employee{
    private String name;//姓名
    private int number;//编号
    private MyDate birthday;//生日

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();//收益

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", number=" + number +
                ", birthday='" + birthday.toDateString() + '\'' +
                '}';
    }
}

//员工的数据
class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString(){
        return year+"年"+month+"月"+day+"日";
    }
}

//按月计算工资的员工
class SalariedEmployee extends Employee{
    private double monthlySalary;//月收入

    public SalariedEmployee(String name,int number,MyDate birthday,double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +super.toString()+
                "monthlySalary=" + monthlySalary +
                '}';
    }
}

//按小时计算工资的员工
class HourlyEmployee extends Employee{
    private int wage;//工资
    private int hour;//小时

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{"+super.toString()+
                "wage=" + wage +
                ", hour=" + hour +
                '}';
    }
}
