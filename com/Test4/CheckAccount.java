package com.Test4;

public class CheckAccount extends Account {
    int overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, int overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("成功取出:" + amount + "元");
            System.out.println("您的账户余额为：" + (balance - amount) + "元");
            System.out.println("您的可透支额为:" + overdraft + "元");
        } else if (amount >= balance) {
            if (overdraft >= (amount - balance)) {
                overdraft -= amount - balance;
                balance = 0;
                System.out.println("您的账户余额为：" + balance + "元");
                System.out.println("您的可透支额为：" + overdraft + "元");
            } else {
                System.out.println("超过可透支限额！");
            }
        }
    }
}











