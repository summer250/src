//3月17日课堂代码
//3月24日课堂代码
package com.Test5;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    int id=1001;

    public Person() {
        super();
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void walk(){
        System.out.println("人走路");
    }
    public void eat(){
        System.out.println("人吃饭");
    }
    public boolean equals(Object o){
        return true;
    }
    //手动调用
//    public String toString() {
//        return "Person :name="+name+"age:"+age;
//    }
    //自动调用
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
