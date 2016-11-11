public class Test {
    public static void main(String[] args) {
        SuperClass[] arr = new SuperClass[10];
        System.out.println(arr.toString());
    }
}

class SubClass extends  SuperClass{
    static{
        System.out.println("subclass");
    }
}


class SuperClass{
    static{
        System.out.println("superclass");
    }
    public  static int value =123;
}
