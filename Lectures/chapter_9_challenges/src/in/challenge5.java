package in;

import java.util.Arrays;
import java.util.List;

public class challenge5 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);
//        Collections.reverse(list);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list){
        for (int i = 0; i < list.size()/2; i++) {
            challenge4.swap(list,i,list.size()-1-i);
        }
    }
}
