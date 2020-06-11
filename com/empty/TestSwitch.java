package com.empty;

/**
 * 一、switch语句
 *
 * switch（变量）{
 *
 *     case 常量1：
 *     语句1；
 *     break；
 *
 *     case 常量2：
 *     语句2；
 *     break；
 *
 *     .....
 *
 *     case 常量N：
 *     语句N；
 *     break；
 *
 *     default：
 *     语句；
 *     break；
 *
 *     （default：）
 * }
 *
 *
 * 1.根据变量的值，从上往下选择case条件去判断，满足case条件的，就执行该case语句下面的语句。
 *   如果没有break或者已经到结尾的话，会继续执行其下的case语句
 * 2.default:是可选的，并且位置是灵活的
 * 3.switch（变量）  变量可以是char、byte、short、int、枚举、String
 * 4.case条件：其中条件只能是值，不能是取值范围
 *
 * 看不懂得话，举个例子：
 *
 *
 *         int i = 4;
 *         switch (i) {
 *             case 0:
 *                 System.out.println("zero");
 *                 break;
 *             case 1:
 *                 System.out.println("one");
 *                 break;
 *             case 2:
 *                 System.out.println("two");
 *                 break;
 *             case 3:
 *                 System.out.println("three");
 *                 break;
 *             default:
 *                 System.out.println("other");
 *                 break;
 *         }
 *
 *  在switch语句中代入i=4
 *  0，1,2,3的case都不符合条件，选择default执行
 *  输出  other
 *  break结束运行
 *
 *  结果就是：other
 *
 *
 *
 *
 *
 *
 *二、do-while 循环
 *
 *  (1)初始化条件
 *  do{
 *    (4)循环体
 *    (3)迭代条件
 *   }while( ( 2 )循环条件 )
 *
 *
 *   运行顺序：
 *   (1) (2) (4) (3)
 *
 *
 *   下面是do-while的例子
 */
public class TestSwitch {
    public static void main(String[] args) {
        //100以内偶数的输出
        int i=1;
        do {
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }while (i<=100);
    }
}

/**
 * 先初始化定义 i=1
 * 进入do-while循环
 *  先看while条件 i<=100 符合条件 进入do 主体部分，不符合条件跳出整个do-while语句
 *  if (i%2==0)  //判断 i/2的余数是否为0，是则说明i是偶数，进入输出语句（输出这个符合条件的i），不是偶数，就跳出if语句
 *  i++          //i进入自增，就是i=i+1 是个迭代条件
 *  从i++出来之后 再进入while（i<=100）语句里判断，如果符合条件，继续循环do主体
 *  无限循环，直到i++出来的值不符合while语句里面的条件，跳出整个do-while语句
 *
 *
 *  简单来说： 求1~5之间的偶数
 *          假设1~5之间只有2,4是偶数
 *  i=1 符合while 进入do语句 1不是偶数 i++这时候i变成2
 *  i=2 进入while里判断 符合，进入do语句  2是偶数，进入输出语句输出此时的i就是2  i++这时候i变成3
 *  i=3 符合while 进入do语句 3不是偶数 i++这时候i变成4
 *  i=4 进入while里判断 符合，进入do语句  4是偶数，进入输出语句输出此时的i就是4  i++这时候i变成5
 *  i=5 符合while 进入do语句 3不是偶数 i++这时候i变成6
 *  i=6 不符合while条件，跳出整个do-while语句
 *  结果就输出：2
 *            4
 *
 *  同理求1~100之间的偶数也是按照这个思路来
 *
 *
 * 结果：
 * 2
 * 4
 * 6
 * 8
 * 10
 * 12
 * 14
 * 16
 * 18
 * 20
 * 22
 * 24
 * 26
 * 28
 * 30
 * 32
 * 34
 * 36
 * 38
 * 40
 * 42
 * 44
 * 46
 * 48
 * 50
 * 52
 * 54
 * 56
 * 58
 * 60
 * 62
 * 64
 * 66
 * 68
 * 70
 * 72
 * 74
 * 76
 * 78
 * 80
 * 82
 * 84
 * 86
 * 88
 * 90
 * 92
 * 94
 * 96
 * 98
 * 100
 */




