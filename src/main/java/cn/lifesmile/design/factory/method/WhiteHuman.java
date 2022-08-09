package cn.lifesmile.design.factory.method;


public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("white");
    }

    @Override
    public void getLanguage() {
        System.out.println("en");
    }
}
