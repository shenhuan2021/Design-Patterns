package cn.lifesmile.design.create.factory.method;


public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("black");
    }

    @Override
    public void getLanguage() {
        System.out.println("xxxx");
    }
}
