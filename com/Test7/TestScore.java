//20年3月31日课外作业
package com.Test7;

import java.util.Scanner;
import java.util.Vector;

public class TestScore {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("输入学生成绩(输入负数结束)：");

        Vector v=new Vector();
        int MaxLevel=0;

        for (;;){
            int score = s.nextInt();
            if (score<0){
                break;
            }

            if (MaxLevel<score){
                MaxLevel=score;
            }

            v.addElement(score);
        }

        for (int i=0;i<v.size();i++){
            Integer score=(Integer)v.elementAt(i);
            char level;

            if (MaxLevel-score<=10){
                level='A';
            }else if (MaxLevel-score<=20){
                level='B';
            }else if (MaxLevel-score<=30){
                level='C';
            }else {
                level='D';
            }
            System.out.println("学生的成绩为："+score+"等级为:"+level);
        }
    }
}
