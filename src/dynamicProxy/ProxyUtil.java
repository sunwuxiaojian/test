package dynamicProxy;/*
 * Created by liujiang on 2016/9/14.
 */

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class ProxyUtil {
    public static void generateCLassFile(Class clazz,String proxyName){
        byte[] classFile = ProxyGenerator.generateProxyClass(proxyName,clazz.getInterfaces());
        String paths = clazz.getResource(".").getPath();
        System.out.println(paths);
        FileOutputStream out  = null;
        try {
            out = new FileOutputStream(paths+proxyName+".class");
            out.write(classFile);
            out.flush();
        } catch (Exception e) {
        }
        finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
