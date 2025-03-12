package in.kgcoding.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class fileW {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        String fileName = "C:\\Users\\asus\\OneDrive\\Desktop\\Java\\Lectures\\chapter_8\\src\\in\\kgcoding\\fileHandling/java-file.txt";

        try(FileWriter write = new FileWriter(fileName);) {
            write.write("This is my first file writer class\n");
            write.write("That it's.");
            write.flush();
            System.out.println("file write successful! ");
        }catch (IOException exception){
            System.out.printf("file %s ", exception.getMessage());
        }
    }
}