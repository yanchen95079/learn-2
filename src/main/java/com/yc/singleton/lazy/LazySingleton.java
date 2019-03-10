package com.yc.singleton.lazy;

/**
 * @author Yanchen
 * date 2019/3/10 14:30
 */
public class LazySingleton {
    private volatile static LazySingleton lazy = null;

    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(lazy == null){
            synchronized (LazySingleton.class){
                if(lazy == null){
                    lazy = new LazySingleton();
                }
            }
        }
        return lazy;
    }
}
