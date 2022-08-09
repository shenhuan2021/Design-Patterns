package cn.lifesmile.design.create.singleton;

/**
 * @author shenhuan
 * @Description 单例--懒汉模式
 * @Date 2022/8/9 9:48 上午
 */
public class LoggerDemo1 {


    /**
     * 构造方法私有化
     */
    private LoggerDemo1() {
    }


    private static LoggerDemo1 logger;

    /**
     * 获取对象方法
     *
     * @return
     */
    public static LoggerDemo1 getInstance() {
        if (logger == null) {
            logger = new LoggerDemo1();
        }
        return logger;
    }

    /**
     * 获取对象方法
     *
     * @return
     */
    public static synchronized LoggerDemo1 getInstance1() {
        if (logger == null) {
            logger = new LoggerDemo1();
        }
        return logger;
    }
}
