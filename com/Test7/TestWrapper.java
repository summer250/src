//20年3月31日课堂代码
package com.Test7;

import org.junit.jupiter.api.Test;

//包装类：8种基本数据类型对应着一个类，此类即为包装类。
//基本数据类型 包装类 及String之间的相互转换
public class TestWrapper {

    //基本数据类型、包装类与String类之间的转换
    @Test
    public void test2(){
        //基本数据类型、包装类--->String类：调用String类的静态的重载的valueOf(Xxx x)方法
        int i1=10;
        String str1=i1+"";//"10"
        Integer i2=i1;
        String str2=String.valueOf(i2);
        String str3=String.valueOf(true);//"true"
        System.out.println(str3);
        //String类--->基本数据类型、包装类:调用包装类的parseXxx(String str)方法
        int i3=Integer.parseInt(str2);
        System.out.println(i3);
        boolean b1=Boolean.valueOf(str3);
        System.out.println(b1);

        //int i4=(int)str2;
    }

    //基本数据类型与包装类之间的转化
    @Test
    public void test1(){
        int i=10;
        System.out.println(i);
        boolean b=false;
        //基本数据类型--->对应的包装类：调用包装类的构造器
        Integer i1=new Integer(i);
        System.out.println(i1.toString());

        Float f=new Float("12.3F");
        System.out.println(f);
        //java.lang.NumberFormatException
        //i1=new Integer("12abc");
        //System.out.println(i1);
        //对于Boolean来讲，当形参是“true”返回true，除此之外返回false
        Boolean b1=new Boolean("false");
        System.out.println(b1);

        b1=new Boolean("true1a");
        System.out.println(b1);

        Order o=new Order();
        System.out.println("$"+o.b);//
        //包装类--->基本数据类型：调用包装类Xxx的XxxValue()方法
        int i2=i1.intValue();
        System.out.println(i2);
        float f1=f.floatValue();
        System.out.println(f1);
        boolean b2=b1.booleanValue();

        //JDK5.0以后，自动装箱和拆箱
        int i4=12;
        Integer i3=i4;//自动装箱
        Boolean bb=false;

        int i5=i3;//自动拆箱
    }
}
class Order{
    Boolean b;
}
