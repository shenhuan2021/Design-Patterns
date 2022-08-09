package cn.lifesmile.design.factory.method;


public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("yellow");
    }

    @Override
    public void getLanguage() {
        System.out.println("chinese");
    }
}
