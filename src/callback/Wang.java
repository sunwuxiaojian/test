package callback;/*
 * Created by liujiang on 2016/10/9.
 */

public class Wang implements  Callback{
    private Li li ;
    public Wang(Li li ){
        this.li = li;
    }

    @Override
    public void solved(String result) {
        System.out.println("the result is"+ result);
    }

    public void ask( final String question){
        new Thread(new Runnable() {
            @Override
            public void run() {
                li.answer(Wang.this,question);
            }
        }).start();
        play();

    }

    public void play(){
        System.out.println("go shopping...");
    }
}
