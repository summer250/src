package com.empty;

/**
 * 关键字---this
 *
 * This含义：
 * 1.它在方法内部使用，即这个方法所属对象的引用；
 * 2.它在构造器内部使用，表示该构造器正在初始化的对象。
 *  this表示当前对象，可以调用类的属性、方法和构造器
 *
 *  什么时候使用this关键字:
 *  当在方法内需要用到调用该方法的对象时，就用this。
 * 3
 */
public class TestThis {
}

/**
 * 1.当形参与成员变量重名时，如果在方法内部需要使用成员变量，必须添加this来表明该变量时类成员
 * 2.在任意方法内，如果使用当前类的成员变量或成员方法可以在其前面添加this，增强程序的阅读性
 */

//使用this，调用属性、方法

class Person{              // 定义Person类
    private String name ;
    private int age ;
    public Person(String name,int age){
        this.name = name ;
        this.age = age ; }
    public void getInfo(){
        System.out.println("姓名：" + name) ;
        this.speak();
    }
    public void speak(){
        System.out.println("年龄：" + this.age);
    }
}

/**
 * 3.this可以作为一个类中，构造器相互调用的特殊格式
 */

//使用this调用本类的构造器

class Person1{                     // 定义Person类
    private String name ;
    private int age ;
    public Person1(){              // 无参构造
        System.out.println("新对象实例化") ;
    }
    public Person1(String name){
        this();                  // 调用本类中的无参构造方法
        this.name = name ;
    }
    public Person1(String name,int age){
        this(name) ;            // 调用有一个参数的构造方法
        this.age = age;
    }
    public String getInfo(){
        return "姓名：" + name + "，年龄：" + age ;
    } }

/**
 * PS:
 * 1.使用this()必须放在构造器的首行
 *
 * 2.使用this调用本类中其他的构造器，保证至少有一个构造器是不用this的。
  */




/**
 当前正在操作本方法的对象称为当前对象。
 */
class Person2{ // 定义Person类
    String name;
    Person2(String name){
        this.name = name;}
    public void getInfo(){
        System.out.println("Person类 --> " + this.name) ; }
    public boolean compare(Person2 p){
        return this.name==p.name;
    } }
class TestPerson{
    public static void main(String args[]){
        Person2 per1 = new Person2("张三") ;
        Person2 per2 = new Person2("李四") ;
        per1.getInfo() ; // 当前调用getInfo()方法的对象是per1
        per2.getInfo() ; // 当前调用getInfo()方法的对象是per2
        boolean b = per1.compare(per2);
    }
}

