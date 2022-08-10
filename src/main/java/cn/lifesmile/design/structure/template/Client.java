package cn.lifesmile.design.structure.template;


public class Client {
    public static void main(String[] args) {
        HummerH1Model h1 = new HummerH1Model();
        h1.setAlarmFlag(false);
        h1.run();
        h1.setAlarmFlag(true);
        h1.run();
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
