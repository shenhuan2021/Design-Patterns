package cn.lifesmile.design.factory.method;


public class HumanFactoryImpl implements IHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> tClass) {
        try {
            return (T) tClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println("出错了！！！");
        }
        return null;
    }
}
