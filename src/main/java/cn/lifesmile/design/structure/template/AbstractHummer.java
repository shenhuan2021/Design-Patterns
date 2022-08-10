package cn.lifesmile.design.structure.template;


public abstract class AbstractHummer {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    /**
     * 模版方法，不允许改变
     */
    public final void run(){
        start();
        engineBoom();
        if(isAlarm()) {
            alarm();
        }
        stop();
    }

    /**
     * 钩子方法
     * @return 是否鸣笛
     */
    protected boolean isAlarm(){
        return true;
    }
}
