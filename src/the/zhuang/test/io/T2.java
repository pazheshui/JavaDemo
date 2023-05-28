package the.zhuang.test.io;

import org.junit.Test;

import java.io.*;

public class T2 {
    @Test
    public void y1() {
        File file = new File("D:\\software\\ideaProject\\JavaDemo\\src\\hello.txt");

        try {
            FileReader fileReader = new FileReader(file);
            int data;
            char[] c = new char[5];
            while ((data = fileReader.read(c)) != -1) {
                for (int i = 0; i < data; i++) {
                    System.out.print(c[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void y21() throws IOException {
        File file = new File("D:\\software\\ideaProject\\JavaDemo\\src\\hello1.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("heoo");
        fileWriter.close();
    }

    @Test
    public void y23() throws IOException {
        File file1 = new File("D:\\software\\ideaProject\\JavaDemo\\src\\hello1.txt");
        File file2 = new File("D:\\software\\ideaProject\\JavaDemo\\src\\hello2.txt");
        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);

        char[] c = new char[5];
        int len;
        while ((len = fileReader.read(c)) != -1) {
            fileWriter.write(c, 0, len);
        }


        fileReader.close();
        fileWriter.close();
    }

    @Test
    public void y24() throws IOException {
        File file1 = new File("D:\\software\\ideaProject\\JavaDemo\\src\\th.jpg");
        File file2 = new File("D:\\software\\ideaProject\\JavaDemo\\src\\yy.jpg");
        FileInputStream fileReader = new FileInputStream(file1);
        FileOutputStream fileWriter = new FileOutputStream(file2);

        byte[] c = new byte[5];
        int len;
        while ((len = fileReader.read(c)) != -1) {
            fileWriter.write(c, 0, len);
        }


        fileReader.close();
        fileWriter.close();
    }

    @Test
    public void y25() throws IOException {
        File file1 = new File("D:\\software\\ideaProject\\JavaDemo\\src\\yy.jpg");
        File file2 = new File("D:\\software\\ideaProject\\JavaDemo\\src\\zz.jpg");
        FileInputStream fileReader = new FileInputStream(file1);
        FileOutputStream fileWriter = new FileOutputStream(file2);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileReader);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileWriter);
        byte[] c = new byte[5];
        int len;
        while ((len = bufferedInputStream.read(c)) != -1) {
            bufferedOutputStream.write(c, 0, len);
        }


        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    @Test
    public void y26() throws IOException {
        File file1 = new File("D:\\software\\ideaProject\\JavaDemo\\src\\hello.txt");
        File file2 = new File("D:\\software\\ideaProject\\JavaDemo\\src\\zz.txt");
        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);

        BufferedReader bufferedInputStream = new BufferedReader(fileReader);
        BufferedWriter bufferedOutputStream = new BufferedWriter(fileWriter);
        String da;
        while ((da = bufferedInputStream.readLine()) != null) {
            bufferedOutputStream.write(da);

        }


        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    @Test
    public void y27() throws IOException {
        File file1 = new File("D:\\software\\ideaProject\\JavaDemo\\src\\hello.txt");
        FileInputStream fileReader = new FileInputStream(file1);
        InputStreamReader fileWriter = new InputStreamReader(fileReader, "utf-8");

        char[] c = new char[6];
        int len;
        while ((len = fileWriter.read(c)) != -1) {
            String s = new String(c, 0, len);
            System.out.println(s);

        }


    }

    @Test
    public void y28() throws IOException {
        ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream("objects.dat"));
        objectInputStream.writeObject(new String("sss223dd"));
        objectInputStream.flush();
        objectInputStream.close();


    }




    @Test
    public void y29() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objects.dat"));
        Object o = objectInputStream.readObject();
        String o1 = (String) o;
        System.out.println(o1);
        objectInputStream.close();


    }


    @Test
    public void y2228() throws IOException {
        ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream("objects11.dat"));
        objectInputStream.writeObject(new Person("sss223dd"));
        objectInputStream.flush();
        objectInputStream.close();


    }

    @Test
    public void y229() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objects11.dat"));
        Object o = objectInputStream.readObject();
        Person o1 = (Person) o;
        System.out.println(o1);
        objectInputStream.close();


    }
}
