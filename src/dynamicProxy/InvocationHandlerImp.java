package dynamicProxy;/*
 * Created by liujiang on 2016/9/14.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImp implements InvocationHandler {
    private ElectricCar car = new ElectricCar();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备调用"+method.getName());
        method.invoke(car,null);
        System.out.println(method.getName()+"调用结束");
        return null;
    }
}
