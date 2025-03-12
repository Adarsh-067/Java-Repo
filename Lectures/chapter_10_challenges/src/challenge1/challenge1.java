package challenge1;

class printThread extends Thread {
     @Override
     public void run() {
         for (int i = 1; i <= 10; i++) {
             System.out.printf("Hello From Thread %d: %d \n",threadName,i);
         }
     }

     private final int threadName;

    public printThread(int threadName){
         this.threadName = threadName;
     }

     public static void main(String[] args) {
         System.out.println("Hello, Adarsh welcome to java world!\n");

         printThread p1 = new printThread(1);
         p1.start();

         System.out.println("\n\n");
         printThread p2 = new printThread(2);
         p2.start();
     }
 }
