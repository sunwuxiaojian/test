package syn;/*
 * Created by liujiang on 2016/9/21.
 */

public class SyncTest {
    public static void main(String[] args) {
//        SyncThread thread = new SyncThread();
//        Thread thread1 = new Thread(thread,"thread1");
//        Thread thread2 = new Thread(thread,"thread2");
//        thread1.start();
//        thread2.start();
//
//        Thread thread3 = new Thread(new SyncThread(),"thread3");
//        Thread thread4 = new Thread(new SyncThread(),"thread4");
//        thread3.start();
//        thread4.start();
//        当一个线程访问object的一个synchronized(this)同步代码块时，其他线程对object中所有其它synchronized(this)同步代码块的访问将被阻塞。
//        当一个线程访问object的一个synchronized(this)同步代码块时，它就获得了这个object的对象锁。结果，其它线程对该object对象所有同步代码部分的访问都被暂时阻塞。
        //所以注意区别printCount方法是不是加synchronized(this) 或者方法上加synchronized关键字
        Counter counter = new Counter();
        Thread threadA = new Thread(counter,"A");
        Thread threadB = new Thread(counter,"B");
        threadA.start();
        threadB.start();



    }
}
