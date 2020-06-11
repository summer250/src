//20年2月26日课堂练习
//20年3月5日课堂练习
package com.Test2;

public class Kids extends ManKind {
    private int yearsOld;

    public Kids(int sex,int salary,int yearsOld) {
        this.setSex(sex);
        this.setSalary(salary);
        this.yearsOld=yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }
    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("yearsOld："+this.yearsOld);
    }
    public void employeed() {
        System.out.println("Kids should study and no job");
    }
}
