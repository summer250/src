package com.empty;

import java.util.Scanner;

/**
 * 通过Scanner类来获取用户的输入
 *
 *
 * 创建Scanner对象的基本语法:
 * Scanner s=new Scanner(System.in);
 *
 *
 *
 * Scanner类下有两个方法：
 * 一、next()
 *      1.一定要读取到有效字符后才可以结束输入。
 *      2、对输入有效字符之前遇到的空白，next () 方法会自动将其去掉。
 *      3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
 *          next () 不能得到带有空格的字符串。
 *
 * 二、nextLine()
 *      1、以 Enter 为结束符，也就是说 nextLine () 方法返回的是输入回车之前的所有字符。
 *      2、可以获得空白。
 *
 *
 *  举个例子(这个是从键盘上输入的，顺带来个视频演示一下）
 *  重点区分  next()和nextLine()的区别
 */
public class TextScanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //从键盘接受数据

        System.out.println("请输入一个字符串(中间能加空格或符号)");
        String a = s.nextLine();

        System.out.println("请输入一个字符串(中间不能加空格或符号)");
        String b = s.next();

        System.out.println("请输入一个整数");
        int c;
        c = s.nextInt();

        System.out.println("请输入一个double类型的小数");
        double d = s.nextDouble();

        System.out.println("请输入一个float类型的小数");
        float f = s.nextFloat();

        System.out.println("按顺序输出abcdf的值：");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);

    }
}

/**
 * 根据视频
 * 在nextLine()中无论输入什么都会原模原样输出出来，包括在前面加空格，中间加空格和在后面加空格 nextLine()讲回车作为结束键
 * 在next()中在前面加空格 会不显示该空格 next()会从第一个有效字符处输出
 *           next()则是把最后的空格最为结束符
 *
 * 例子：
 * 在next()中    请输入一个字符串(中间不能加空格或符号)
 *              请输入一个整数
 *
 * 输入： 123   12
 * next()不会输出：123   12
 *
 * next()把123后面的空格作为结束键
 * 输出：123
 *
 * 而空格后面的12  则默认作为next()语句的下一个   请输入一个整数  的输出语句
 *
 *
 * 结果为：
 *
 *      请输入一个字符串(中间不能加空格或符号)
 *          123   12
 *      请输入一个整数
 *      请输入一个double类型的小数
 *      2.2
 *
 *
 *      123
 *      12
 *      2.2
 */