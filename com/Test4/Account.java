//20年3月12日课外作业
package com.Test4;

public class Account{
    private int id;
    protected double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest(){
        return this.annualInterestRate/12;
    }
    public void withdraw (double amount){
        if (amount<=balance){
            balance-=amount;
        System.out.println("成功取出:"+amount+"元");
        System.out.println("您的账户余额为："+balance+"元");
        }else {
            System.out.println("余额不足！");
            System.out.println("您的账户余额为："+balance+"元");
        }
    }
    public void deposit (double amount){
        balance+=amount;
        System.out.println("成功储蓄:"+amount+"元");
        System.out.println("您的账户余额为："+balance+"元");
    }
}
