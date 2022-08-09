package cn.lifesmile.design.factory.method;


public interface IHumanFactory {
    <T extends Human> T createHuman(Class<T> tClass);
}
