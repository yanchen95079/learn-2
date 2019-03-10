package com.yc.singleton.threadlocal;

/**
 * @author Yanchen
 * date 2019/3/10 15:14
 */
public class ThreadLocalDemo {
    private static final ThreadLocal<ThreadLocalDemo> threadLocalInstance =
            new ThreadLocal<ThreadLocalDemo>(){
                @Override
                protected ThreadLocalDemo initialValue() {
                    return new ThreadLocalDemo();
                }
            };

    private ThreadLocalDemo(){}

    public static ThreadLocalDemo getInstance(){
        return threadLocalInstance.get();
    }
}
