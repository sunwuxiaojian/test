package test;/*
 * Created by liujiang on 2016/10/24.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<>();
//        String temp="";
//        for(int i=0;i<1500000;i++){
//            String uuid = UUID.randomUUID().toString();
//            if(i==98943) temp=uuid;
//            map.put(uuid,"test");
//        }
//        System.out.println(map.size());
//        System.out.println(temp);
//        System.out.println(System.currentTimeMillis());
//        System.out.println(map.get(temp));
//        System.out.println(System.currentTimeMillis());
//        map.put(temp,"test1");
//        System.out.println(System.currentTimeMillis());
//        System.out.println(map.get(temp));
//        System.out.println(System.currentTimeMillis());
//        map.remove(temp);
//        System.out.println(System.currentTimeMillis());
        List<String> list = new ArrayList<>();
        list.add("A123");
        list.add("1236F");
        list.add("235fhgf2$@%");
        list.add("1_1243");
        list.add("1-235");
        list.add("FG145FGKL");
        list.forEach(test -> {
            System.out.println(isValid(test));
        });
        int[] a = new int[0];
    }

    public static boolean isValid(String test){
        String reg = "[A-Za-z0-9]*";

        return Pattern.matches(reg,test);
    }
    /**可见hashMap的查询效率之高
     *  1500000
        82d9904f-b88e-4764-a421-63633ad5ad5e
        1477298343709
        test
        1477298343709
     */
}
