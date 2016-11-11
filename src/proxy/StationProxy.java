package proxy;/*
 * Created by liujiang on 2016/9/13.
 */

//车站代售点类  同样的实现了service接口 service感觉就是代理类和委托类之间的一个约定  彼此都知道对方可以做什么
public class StationProxy implements Service{
    private Service service;

    public StationProxy(){
        this.service = new Station();//编译时确定了代理类和委托类之间的关系  所以为静态代理
    }

//    public StationProxy(Service service){
//        this.service = service;//这种方式不好 因为当委托类通过构造函数传参进来时 客户已经有了委托了 那还要代理类干嘛？
//    }

    @Override
    public void ask() {
        System.out.println("代售点不收取问询代理费");
        service.ask();
    }

    @Override
    public void sell() {
        System.out.println("代售点收取5元买票手续费");
        service.sell();
    }

    @Override
    public void withdraw() {
        System.out.println("代售点收取2元退票手续费");
        service.withdraw();
    }
}
