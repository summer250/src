package com.Test1;
//20年2月19日课外作业
public class TestBoyGirl {
    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.setName("海绵宝宝");
        boy.setAge(23);

        Girl girl=new Girl();
        girl.setName("派大星");

        boy.marry(girl);
        boy.shout();
        System.out.println();
        girl.marry(boy);
    }
}

class Boy{
    String name;
    int age;

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

    public void marry(Girl girl){
        System.out.println("我要娶"+girl.getName());
    }
    public void shout(){
        if (age>=23){
            System.out.println("我到了结婚的年龄");
        }else{
            System.out.println("还是先谈谈恋爱吧");
        }
    }
}

class Girl{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy){
        System.out.println("我要嫁给"+boy.getName());
        boy.marry(this);
    }
}