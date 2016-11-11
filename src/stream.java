
import java.io.*;

public class stream {
    public static void main(String[] args) throws IOException {
        String path = "D:/1.txt";
        File file = new File(path);
        if(!file.exists()) file.createNewFile();
        InputStream  in = new FileInputStream(file);
        byte[] array = new byte[(int)file.length()];
//        in.read(array);//字节流读
        int count = 0;
        byte temp;
        while((temp=(byte)in.read())!=-1){
            array[count++] = temp;
        }
        System.out.println(new String(array));
        in.close();
        FileOutputStream out = new FileOutputStream(file,true);

        String text = "hello world";
        out.write(text.getBytes());
        out.flush();
        out.close();

        File[] name = new File("D:/").listFiles();
        for(File tempName:name){
          if(!tempName.isDirectory()){
//              Reader reader = new FileReader(tempName);
              System.out.println(tempName.getName());
              Reader reader= new BufferedReader(new InputStreamReader(new FileInputStream(tempName),"GBK"));
              char[] charArray = new char[1024];
              reader.read(charArray);
              System.out.println(charArray);
              System.out.println("--------------------------------------------------------------------------------------");
            }

        }
        //管道流
        PipedInputStream in1 = new PipedInputStream();
        PipedOutputStream out1 = new PipedOutputStream();
        in1.connect(out1);
        String test = "T11992-12-18";
        System.out.println(test.substring(test.length()-10));
//        system.se
    }
}
