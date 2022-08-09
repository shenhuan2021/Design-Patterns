package cn.lifesmile.design.create.factory.method;


public class Test {

    public static void main(String[] args) {
        IHumanFactory factory = new HumanFactoryImpl();

        Human white = factory.createHuman(WhiteHuman.class);
        white.getColor();
        white.getLanguage();
        Human black = factory.createHuman(BlackHuman.class);
        black.getColor();
        black.getLanguage();
        Human yellow = factory.createHuman(YellowHuman.class);
        yellow.getColor();
        yellow.getLanguage();

    }
}
