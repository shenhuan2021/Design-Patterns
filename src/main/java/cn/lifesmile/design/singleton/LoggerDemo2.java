package cn.lifesmile.design.singleton;

/**
 * @author shenhuan
 * @Description 单例--双重检验锁
 * @Date 2022/8/9 9:48 上午
 */
public class LoggerDemo2 {


    /**
     * 构造方法私有化
     */
    private LoggerDemo2() {
    }


    private static volatile LoggerDemo2 logger;
    //private static  LoggerDemo2 loggerx;

    /**
     * 获取对象方法
     *
     * @return
     */
    public static LoggerDemo2 getInstance() {
        if (logger == null) {
            synchronized (LoggerDemo2.class) {
                logger = new LoggerDemo2();
            }
        }
        return logger;
    }
}
