package reflect;/*
 * Created by liujiang on 2016/9/14.
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //类加载器 bootstrapclassloader  extclassloader appclassLoader customClassLoader
//        List<String> name =(List<String>) Class.forName("java.util.ArrayList").newInstance();
//        name.add("test'");
//        name.add("crscd");
//        name.add("street");
//        System.out.println(name.size());
//        System.out.println(ReflectTest.class.getClassLoader());
        System.out.println(Car.class.getName());
        Car car = (Car)Class.forName("reflect.Car").newInstance();
//        Constructor constructor = Thread.currentThread().getContextClassLoader().loadClass("reflect.Car").getConstructor();
//        Car car = (Car)constructor.newInstance();
        Method method = Class.forName("reflect.Car").getMethod("setBrand",String.class);
        method.invoke(car,"benz");
        Field field  =Class.forName("reflect.Car").getField("color");
        field.setAccessible(true);
        Field speed = Class.forName("reflect.Car").getField("maxSpeed");

        speed.setAccessible(true);
        speed.setInt(car,1000);
        car.introduce();


        TestStatic test1 = new TestStatic();
        TestStatic test2 =(TestStatic) Class.forName("reflect.TestStatic").newInstance();
        TestStatic test3 =(TestStatic) Class.forName("reflect.TestStatic",false,Thread.currentThread().getContextClassLoader()).newInstance();
        TestStatic test4 =(TestStatic) Thread.currentThread().getContextClassLoader().loadClass("reflect.TestStatic").newInstance();
    }
}

class TestStatic{
    static{
        System.out.println("this is static block ");
    }
}
