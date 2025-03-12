package in;

import java.util.Comparator;
import java.util.PriorityQueue;

class studentPriorityQueue {
     public static void main(String[] args) {
         System.out.println("Hello, Adarsh welcome to java world!\n");

         PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>() {
             @Override
             public int compare(student o1, student o2) {
                 return o1.getGrade() - o2.getGrade();
             }
         });

         queue.offer(new student("prashant" , 'B'));
         queue.offer(new student("Shyam" , 'C'));
         queue.offer(new student("Ram" , 'A'));
         queue.offer(new student("Mohan" , 'D'));
         queue.offer(new student("Sanchit" , 'A'));

         System.out.printf("Queue is: %s \n", queue);
         System.out.printf("Got %s\n", queue.poll());
         System.out.printf("Got %s\n", queue.poll());
         System.out.printf("Got %s\n", queue.poll());
         System.out.printf("Got %s\n", queue.poll());
         System.out.printf("Got %s\n", queue.poll());
     }

     private static class student{
         private final String name;
         private final char grade;

         public student(String name, char grade) {
             this.name = name;
             this.grade = grade;
         }

         public String getName() {
             return name;
         }

         public char getGrade() {
             return grade;
         }

         @Override
         public String toString() {
             return name + ": " + grade;
         }
     }
}
