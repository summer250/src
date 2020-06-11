//20年4月28日课堂代码
package com.Test8;

public class TestUSB {
    public static void main(String[] args) {
        Computer com=new Computer();
        com.doWork(new Printer());

        Flash f=new Flash();
        com.doWork(f);

        //实现接口的匿名类对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机正常工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止工作");
            }
        };
        com.doWork(phone);

        //实现接口的匿名类对象
        com.doWork(new USB() {
            @Override
            public void start() {
                System.out.println("手机正常工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止工作");
            }
        });
    }
}
class Computer{
    public void doWork(USB usb){//USB usb=new Printer();
                               //USB usb=new Flash();
        usb.start();
        System.out.println("...此设备开始运行...");
        usb.stop();
    }
}
interface USB{
    //USB的尺寸的大小,可以设置为常量

    //USB的功能设置为抽象方法
    void start();
    void stop();
}
class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机正常工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}
class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘正常工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}
