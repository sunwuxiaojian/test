package proxy;/*
 * Created by liujiang on 2016/9/13.
 */
//车站类 实现了服务接口 对外提供服务
public class Station implements Service {
    @Override
    public void ask() {
        System.out.println("问询业务");
    }

    @Override
    public void sell() {
        System.out.println("售票业务");
    }

    @Override
    public void withdraw() {
        System.out.println("退票业务");
    }
}
