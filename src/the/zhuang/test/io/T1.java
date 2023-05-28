package the.zhuang.test.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class T1 {
    public static void main(String[] args) {
        File file = new File("D:\\software\\ideaProject\\JavaDemo\\src\\hello.txt");

        try {
            FileReader fileReader = new FileReader(file);
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
