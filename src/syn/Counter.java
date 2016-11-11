package syn;/*
 * Created by liujiang on 2016/9/21.
 */

public class Counter implements Runnable {
    private static int count = 0;
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("A")){
            countAdd();
        }else if(name.equals("B")){
            printCount();
        }

    }

    public  int getCount() {
        return count;
    }

    public void countAdd(){
        synchronized (this){
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

    public void printCount(){
        synchronized (this){
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"："+count);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
