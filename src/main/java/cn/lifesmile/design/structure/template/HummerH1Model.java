package cn.lifesmile.design.structure.template;


public class HummerH1Model extends AbstractHummer {

    private boolean alarmFlag;

    @Override
    protected void start() {
        System.out.println("h1 start...");
    }

    @Override
    protected void stop() {
        System.out.println("h1 stop...");
    }

    @Override
    protected void alarm() {
        System.out.println("h1 alarm...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("h1 engineBoom...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag){
        this.alarmFlag = alarmFlag;
    }
}
