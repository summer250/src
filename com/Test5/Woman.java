//3月17日课堂代码
package com.Test5;

public class Woman extends Person {
    private boolean isBeauty;

    public Woman() {
        super();
    }
    public Woman(boolean isBeauty) {
        super();
        this.isBeauty = isBeauty;
    }

    public boolean isBeauty() {
        return isBeauty;
    }
    public void setBeauty(boolean beauty) {
        isBeauty = beauty;
    }

    public void walk(){
        System.out.println("女人窈窕的走路");
    }
    public void eat(){
        System.out.println("女人应该少吃，减肥");
    }
    public void shopping(){
        System.out.println("女人爱购物！");
    }


}
