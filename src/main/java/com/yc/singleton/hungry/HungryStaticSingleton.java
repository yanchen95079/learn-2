package com.yc.singleton.hungry;

/**
 * @author Yanchen
 * date 2019/3/10 14:21
 * 饿汉静态实现
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    public static HungryStaticSingleton getInstance(){
        return  hungrySingleton;
    }
}
