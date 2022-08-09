package cn.lifesmile.design.create.factory.method;


public interface IHumanFactory {
    <T extends Human> T createHuman(Class<T> tClass);
}
