package callback;/*
 * Created by liujiang on 2016/10/9.
 */

public class Li {
   public void answer(Callback callback,String question){

       System.out.println("the question is "+question);
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       String result = "2";
       callback.solved(result);
   }

}
