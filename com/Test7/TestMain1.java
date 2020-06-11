//20年4月8日课堂代码
package com.Test7;

public class TestMain1 {
    //程序入口
    public static void main(String[] args) {
        Main.main(new String[1000]);
    }
}
class Main{
    //一般main方法
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            args[i]="value_"+i;
            System.out.println(args[i]);
        }
    }
}