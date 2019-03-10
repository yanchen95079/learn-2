package com.yc.singleton;

import com.yc.singleton.hungry.HungrySingleton;
import com.yc.singleton.hungry.HungryStaticSingleton;
import com.yc.singleton.lazy.LazySingletonNb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Constructor;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingletonApplicationTests {

    /**
     * 恶汉
     */
    @Test
    public void HungryStaticSingleton() {
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungryStaticSingleton.getInstance());

    }
    @Test
    public void LazySingletonNb() {
       // LazySingletonNb.getInstance();
        try{
            Class<?> clazz = LazySingletonNb.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
