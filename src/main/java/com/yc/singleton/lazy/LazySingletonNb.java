package com.yc.singleton.lazy;

/**
 * @author Yanchen
 * date 2019/3/10 14:38
 */
public class LazySingletonNb {
    private LazySingletonNb(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
        System.out.println(1111);
    }
    public static LazySingletonNb getInstance(){
        System.out.println(2222);
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazySingletonNb LAZY = new LazySingletonNb();
    }
}
