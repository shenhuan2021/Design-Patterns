package cn.lifesmile.design.create.singleton;

/**
 * @author shenhuan
 * @Description 单例--静态内部类
 * @Date 2022/8/9 9:48 上午
 */
public class LoggerDemo3 {


    /**
     * 构造方法私有化
     */
    private LoggerDemo3() {
    }

    /**
     * 静态内部类
     */
    private static class Singleton {
        private static LoggerDemo3 instance = new LoggerDemo3();
    }


    /**
     * 获取对象方法
     *
     * @return
     */
    public static LoggerDemo3 getInstance() {
        return Singleton.instance;
    }
}
