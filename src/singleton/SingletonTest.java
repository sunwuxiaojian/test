package singleton;/*
 * Created by liujiang on 2016/9/21.
 */

public class SingletonTest {
    //懒汉式单例模式 如果不加锁会存在线程安全的问题
    private SingletonTest(){}
    private static SingletonTest instance = null;
    public static synchronized SingletonTest getInstance(){
        if(null==instance){
            instance = new SingletonTest();
        }
        return instance;
    }

    public static SingletonTest getInstance2(){
        if(null==instance){
            synchronized (SingletonTest.class){
                if(null==instance){
                    instance = new SingletonTest();
                }
            }
        }
        return instance;
    }

    //饿汉式单例模式 直接创建对象 天生线程安全
    private static SingletonTest instance2 = new SingletonTest();
    public static SingletonTest getInstance3(){
        return instance2;
    }

}
