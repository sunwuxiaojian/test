package proxy;/*
 * Created by liujiang on 2016/9/13.
 */

public class Main {
    public static void main(String[] args) {
        StationProxy proxy = new StationProxy();
        proxy.ask();
        proxy.sell();
        proxy.withdraw();
    }

}
