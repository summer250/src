//20年3月12日课堂代码
package com.Test4;
/*
 *super:可以用来修饰属性、方法、构造器
 *
 * 1）当子类与父类中有同名的属性时，可以通过"super.此属性"显示的调用父类中声明的属性
 *    若想要调用子类同名的属性，就用“this.此属性”
 * 2) 当子类重写父类的方法后，在子类中若想再显示的调用父类的被调用方法，就需要使用“super.方法”
 * 3) super修饰构造器，通过在子类中使用“super（形参列表）”来显示调用父类中指定的构造器
 *     >在构造器内部，“super（形参列表)”必须声明在首行。
 *     >在构造器内部，“this.（形参列表）”或“super（形参列表）”其中任何一个，
 *       默认调用的是父类空参构造器
 *       建议：设计一个类时，尽量要提供一个空参的构造器
 */
public class Student  extends Person {
    private String schoolName;//校名
    int id = 1002;//学号

    public Student(){

    }
    public Student(String schoolName){
        super("李雷",24);
        this.schoolName=schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void eat(){
        System.out.println("学生吃饭");
    }
    public void info(){
        this.eat();//本类（子类）Student的方法
        super.eat();//调用父类的eat方法
        walk();//this.walk()等同于super.walk()
    }
    public void show(){
        System.out.println(this.id);
        System.out.println(super.id);
    }
}
