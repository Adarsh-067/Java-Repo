import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Scanner input = new Scanner(System.in);
        System.out.print("please enter a file name you wish: ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while ((read = reader.read()) != -1){
                System.out.print((char)read);
            }
        }catch (FileNotFoundException exception){
            System.out.printf("%s not found.",fileName);
        }
        catch (IOException exception){
            System.out.printf("Exception occurred: %s",exception.getMessage());
        }
    }
}
