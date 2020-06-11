//20年3月12日课外作业
package com.Test4;

public class TestAccount {
    public static void main(String[] args) {
        Account a = new Account(1122,20000,0.045);

        a.withdraw(30000);
        System.out.println();

        a.withdraw(2500);
        System.out.println();

        a.deposit(3000);
        System.out.println("月利率为："+a.getMonthlyInterest());


    }
}
