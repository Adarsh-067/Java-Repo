public class Array {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

//        int[] myArray = new int[5];
//        myArray[0] = 10;
//        myArray[1] = 20;
//        myArray[2] = 30;
//        myArray[3] = 40;
//        myArray[4] = 50;

//        System.out.println(myArray[0]);
//        System.out.println(myArray[1]);
//        System.out.println(myArray[2]);
//        System.out.println(myArray[3]);
//        System.out.println(myArray[4]);

        int[] myArr = {10,20,30,40,50};
        int i = 0;
        while (i < 5){
            System.out.println(myArr[i]);
            i++;
        }

        String[] myStr = {"one", "two", "three", "four"};
        int j = 0;
        while (j < myStr.length){
            System.out.println(myStr[j]);
            j++;
        }
    }
}
