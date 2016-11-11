package serialize;/*
 * Created by liujiang on 2016/9/28.
 */

import java.io.*;

public class Test implements Serializable {

     transient  Test1 test1 = new Test1();
    int a = 1;

    public static void main(String[] args) {
        Test test = new Test();
        //序列化
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:test.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(test);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        test = null;
        //反序列化

        try {
            FileInputStream fs = new FileInputStream("D:test.txt");
            ObjectInputStream os = new ObjectInputStream(fs);
            test = (Test)os.readObject();
            System.out.println(test.a);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Test1{

}
