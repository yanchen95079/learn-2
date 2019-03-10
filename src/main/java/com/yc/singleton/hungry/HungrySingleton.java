package com.yc.singleton.hungry;

/**
 * @author Yanchen
 * date 2019/3/10 14:17
 *  饿汉
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return  hungrySingleton;
    }
    //解决序列化的后果
    private  Object readResolve(){
        return  hungrySingleton;
    }
}
