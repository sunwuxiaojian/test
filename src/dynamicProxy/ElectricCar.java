package dynamicProxy;/*
 * Created by liujiang on 2016/9/14.
 */

public class ElectricCar implements Vehicle,Rechargeable {
    @Override
    public void drive() {
        System.out.println("moving silently");
    }

    @Override
    public void charge() {
        System.out.println("is charging");
    }
}
