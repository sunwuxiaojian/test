package callback;/*
 * Created by liujiang on 2016/10/9.
 */

public class Main {
    public static void main(String[] args){
        Li li = new Li();
        Wang wang = new Wang(li);
        wang.ask("1+1");
    }
}
