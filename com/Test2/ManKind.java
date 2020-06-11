//20年2月26日课堂练习
//20年3月5日课堂代码
package com.Test2;

public class ManKind {
    private int sex;
    private int salary;

    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWorman(){
        if (sex==1){
            System.out.println("man");
        }else if (sex==0){
            System.out.println("women");
        }else {
            System.out.println("性别错误");
        }
    }
    public void employeed(){
        if (salary==0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }
}
