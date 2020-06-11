package com.Test4;

public class TestCheckAccount {
    public static void main(String[] args) {
        CheckAccount c = new CheckAccount(1122,20000,0.045,5000);

        c.withdraw(5000);
        System.out.println();

        c.withdraw(18000);
        System.out.println();

        c.withdraw(3000);
        System.out.println();

        System.out.println("您的账户余额为："+c.getBalance()+"元");
        System.out.println("您的可透支额为："+c.getOverdraft()+"元");
    }
}
