package com.Test1;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer=new Customer("Jane","Smith");
        customer.setAccount(new Account(1000,2000,0.0123));



    }
}

class Account{
    private int id;//账户
    private double balance;//余额
    private double annuallntersetRate;//年利率

    public Account(int id, double balance, double annuallntersetRate) {
        this.id = id;
        this.balance = balance;
        this.annuallntersetRate = annuallntersetRate;
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

    public double getAnnuallntersetRate() {
        return annuallntersetRate;
    }

    public void setAnnuallntersetRate(double annuallntersetRate) {
        this.annuallntersetRate = annuallntersetRate;
    }
    //取钱
    private void withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println("成功取出："+amount);
        }else {
            System.out.println("您的余额不足，取款失败");
        }
    }
    //存钱
    public void deposit(double amount){
        balance+=amount;
        System.out.println("成功存款："+amount);
    }
}

class Customer{
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}