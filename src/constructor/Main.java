package constructor;/*
 * Created by liujiang on 2016/9/14.
 */

public class Main {
    //子类初始化之前 先调用父类的构造函数 再调用子类的构造函数 如果没有在子类的构造函数第一行显式调用父类的构造函数 则默认的去找父类的无参构造函数
    //如果此时找不到父类的无参构造函数 那么编译通不过 解决方案为显式调用父类的构造函数（super关键字） 或者为父类加上无参构造函数
    //子类显式调用父类的构造函数时  必须放在第一行
    public static void main(String[] args) {
        SubClass subClass =new SubClass("test");
    }
}
