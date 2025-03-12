package in.kgcoding.fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class fileR {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");


        String name = "C:\\Users\\asus\\OneDrive\\Desktop\\Java\\Lectures\\chapter_8\\src\\in\\kgcoding\\fileHandling/java-file.txt";

        try (FileReader reader = new FileReader(name)){
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char)read);
            }while(read != -1);
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
