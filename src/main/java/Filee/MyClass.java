package Filee;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MyClass {
    public static void main(String[] args) {
String dirPath = "folder"+ File.separator + "AnotherFolder";

File dir = new File(dirPath);
if(!dir.exists()){
    dir.mkdirs();
}
     File file = new File(dir + File.separator + "MyFile.txt");
    if(!file.exists()){
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canWrite());


        try {
            FileOutputStream os = new FileOutputStream(file);
            String str = "My Name is Stranger";
            os.write(str.getBytes());
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream is = new FileInputStream(file);
            int i;
            while((i=is.read())!=-1){
                System.out.print((char)i);
            }
            is.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //file.delete();
//        try {
//            FileWriter fw = new FileWriter(file);
//            fw.write("hello first line");
//            fw.flush();
//            fw.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            FileReader fr = new FileReader(file);
//            int i;
//            while((i = fr.read()) != -1){
//                System.out.print((char)i);
//            }
//
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//

    }}
