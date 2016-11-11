package syn;/*
 * Created by liujiang on 2016/9/21.
 */


public class SyncThread implements Runnable{
    private static int count = 0;
    @Override
    public void run() {
//        synchronized (this){ //体会此处this 和.class的区别
          synchronized (SyncThread.class){
                for(int i=0;i<5;i++){
                    System.out.println(Thread.currentThread().getName()+"："+count++);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    public static int getCount() {
        return count;
    }
}


