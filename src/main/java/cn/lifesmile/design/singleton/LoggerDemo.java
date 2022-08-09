package cn.lifesmile.design.singleton;

/**
 * @author shenhuan
 * @Description 单例--饿汉模式
 * @Date 2022/8/9 9:48 上午
 */
public class LoggerDemo {


    /**
     * 构造方法私有化
     */
    private LoggerDemo() {
    }

    /**
     * 创建对象
     */
    private final static LoggerDemo logger = new LoggerDemo();

    /**
     * 获取对象方法
     *
     * @return
     */
    public static LoggerDemo getInstance() {
        return logger;
    }
}
