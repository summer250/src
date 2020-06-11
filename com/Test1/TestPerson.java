//20年2月19日课堂代码
package com.Test1;
/*
 *  this:
 *  1.可以用来修饰属性
 *  2.this理解为当前对象或当前正在创建的对象
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(10);
        p.info();
        p.setName("李雷");
        p.info();
    }
}

class Person{
    private String name;
    private int age;


    //构造器
    public Person(){
    }
    public Person(String name){
        this.name=name;
    }
    public Person(int age){
        this.age=age;
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }


    //this
    public void setName(String name){
        this.name=name;//this.name表示当前对象的属性，等号后面的name
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }
    public void info(){
        System.out.println("name:"+this.name+"age:"+this.age);
        this.show();
    }
    public void show(){
        System.out.println("我是一个人，我的名字是："+this.name);
    }
}
