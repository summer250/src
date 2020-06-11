package com.empty;

/**
 *      一、类的成员之一：属性
 * 语法格式：
 *      修饰符  类型  属性名 = 初值
 * 说明：
 *      1.修饰符private：该属性只能由该类的方法访问
 *      2.修饰符public：该属性可以被该类以外的方法访问
 *      3.类型：任何基本类型，如int、boolean或任何类
 * 举个例子：
 *      public class Person{
 *          private int age;                //声明private变量age
 *          public String name="Lila";      //声明public变量name
 *      }
 *
 *
 *      二、变量的分类：成员变量与局部变量（了解知道就好了，不需要强记住）
 *  在方法体外，类体内声明的变量称为成员变量。
 *  在方法体内部声明的变量称为局部变量。
 *
 *    ***********   下面这个图原谅我画的比较抽象   *************
 *
 *                         |----实例变量（不以static修饰）
 *          |----成员变量
 *                         |----类变量（以static修饰）
 * 所有变量
 *                         |-----形参（方法签名中定义的变量）
 *          |----局部变量   |-----方法局部变量（在方法内定义）
 *                         |-----代码块局部变量（在代码块内定义）
 *
 *  注意：二者在初始化值方面的异同:
 *  同：都有生命周期
 *  异：局部变量除形参外，需显式初始化。
 *
 *          成员变量（属性）和局部变量的区别？
 *   成员变量：
 *       成员变量定义在类中，在整个类中都可以被访问。
 *       成员变量分为类成员变量和实例成员变量，实例变量存在
 *         于对象所在的堆内存中。
 *       成员变量有默认初始化值。
 *       成员变量的权限修饰符可以根据需要，选择任意一个
 *  局部变量：
 *       局部变量只定义在局部范围内，如：方法内，代码块内等。
 *       局部变量存在于栈内存中。
 *       作用的范围结束，变量空间会自动释放。
 *       局部变量没有默认初始化值，每次必须显式初始化。
 *       局部变量声明时不指定权限修饰符
 *
 *
 *      三、类的成员之二：方法
 * 1.语法格式：
 *      修饰符 返回值类型 方法名 (参数列表) {
 *          方法体语句；
 *      }
 * 2.说明： 修饰符：public, private, protected等。
 *      返回值类型：return语句传递返回值。没有返回值：void。
 * 3.举例：
 *      public class Person{
 *          private int age;
 *          public int getAge() { return age; } //声明方法getAge
 *          public void setAge(int i) { //声明方法setAge
 *              age = i; //将参数i的值赋给类的成员变量age
 *          }
 *       }
 *
 *
 *
 *      四、创建Java自定义类
 *  步骤:
 * 1.定义类（考虑修饰符、类名）
 * 2.编写类的属性（考虑修饰符、属性类型、属性名、初始化值）
 * 3.编写类的方法（考虑修饰符、返回值类型、方法名、形参等）
 *
 */




public class TestClass {
    public static void main(String[] args) {
        //实例化学生类、教师类
        /**
         * 使用new +构造器创建一个新的对象；
         * 使用“对象名.对象成员”的方式访问对象成员（包括属性和方法）；
         */
        Student student=new Student("小明",12,"数学","打篮球");
        Teacher teacher=new Teacher("老王","体育","数学",10);

        //输出信息
        student.StudentInfo();
        teacher.TeacherInfo();

    }

}

//创建学生类
class Student{

    //属性
    /**
     * 整数类型用int
     * 字符串类型用String
     * 小数类型用double
     */
    String name;
    int age;
    String course;
    String interest;

    //构造器 （一般建一个空参的构造器和一个带参数的构造器）
    public Student() {
    }

    public Student(String name, int age, String course, String interest) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.interest = interest;
    }
    //构建get和set 方法
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    //方法(显示学生的个人信息）
    public void StudentInfo(){
        System.out.println("姓名："+name+
                            "年龄："+age+
                            "参加的课程："+course+
                            "兴趣："+interest);
    }
}


//创建教师类
class Teacher{
    //属性
    String name;        //姓名
    String profession;  //专业
    String course;      //教授的课程
    int SchoolAge;      //教龄

    //构造器
    public Teacher() {
    }

    public Teacher(String name, String profession, String course, int schoolAge) {
        this.name = name;
        this.profession = profession;
        this.course = course;
        SchoolAge = schoolAge;
    }

    //get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSchoolAge() {
        return SchoolAge;
    }

    public void setSchoolAge(int schoolAge) {
        SchoolAge = schoolAge;
    }

    //方法(显示教师的个人信息）
    public void TeacherInfo(){
        System.out.println("姓名："+name+
                "专业："+profession+
                "教授的课程："+course+
                "兴趣："+SchoolAge);
    }
}


