//20年4月29日课堂代码
package com.Test9;

/**
 * 关于局部内部类
 */
public class TestInnerClass1 {
}
class OuterClass{
    public void method1(){
        //局部内部类
        //如下使用方式较少
        class InnerClass{

     }
    }
    //常常使用要给方法,使其返回值为某个类或接口的对象.而这个类或接口在方法内部创建
    //使用方法一:
    public Comparable getComparable() {
        //1.创建一个实现Comparable接口的类:局部内部类
        class Mycomparable implements Comparable {

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        //返回一个实现类的对象
        return new Mycomparable();
    }

    //使用方法二:
    public Comparable getComparable1(){
        //返回一个实现Comparable接口的匿名内部类的对象
        return new Comparable(){

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

}
