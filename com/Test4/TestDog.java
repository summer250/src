//20年3月12日课堂代码
package com.Test4;
//子类对象实例化的全过程
public class TestDog {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(10);
        d.setName("花花");
        d.setHostName("聪聪");
        System.out.println("name："+d.getName()+"age:"+d.getAge()+"hostName:"+d.getHostName());

    }

}
//生物类
class Creator{
    private int age;

    public Creator() {
        super();
        System.out.println("This is Creator constructor");
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
//动物类
class Animal extends Creator{
    private String name;

    public Animal() {
        super();
        System.out.println("This is Animal's constructor");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
//狗
class Dog extends Animal{
    private String hostName;

    public Dog() {
        super();
        System.out.println("This is Dog's constructor");
    }

    public String getHostName() {
        return hostName;
    }
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
