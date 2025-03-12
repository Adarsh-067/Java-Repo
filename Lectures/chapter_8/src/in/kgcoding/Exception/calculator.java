package in.kgcoding.Exception;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world\n");

        a();
    }

    public static void a(){
        b();
    }

    public static void b(){
        c();
    }

    public static void c(){
        d();
    }

    public static void d(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, second number: ");
        int sec = input.nextInt();

        try {
            int[] arr = new int[5];
            arr[6] = first / sec;
            System.out.println(arr[6]);
        }catch (ArithmeticException exception){
            System.out.println(exception.getMessage() + ", please valid number.");
        }catch (ArrayIndexOutOfBoundsException exc){
            throw exc;
        }catch (Throwable e){
            System.out.println("multiple exception.");
        }finally {
            System.out.println("finally");
        }

       /* System.out.print("Please enter your name: ");
        String name = input.next();*/

//        printName(name);
    }



    public static void printName(String name){
            if (name.contains("-")){
                throw new IllegalArgumentException("name contains ' - ' ");
            }
            System.out.println("My name is: " + name);
        }
    }
