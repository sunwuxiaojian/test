package dynamicProxy;/*
 * Created by liujiang on 2016/9/14.
 */

import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        ClassLoader classLoader = ElectricCar.class.getClassLoader();
        Class[] interfaces = ElectricCar.class.getInterfaces();
        InvocationHandler handler = new InvocationHandlerImp();
        Object o = Proxy.newProxyInstance(classLoader,interfaces,handler);
        Vehicle vehicle = (Vehicle)o;
        vehicle.drive();
        Rechargeable rechargeable = (Rechargeable)o;
        rechargeable.charge();
        ProxyUtil.generateCLassFile(ElectricCar.class,"ElectricCarProxy");

    }
}
