package in;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class challenge4 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);
        swap(list,2,5);
        System.out.println(list);
    }

    public static void swap(List<Integer> list, int x, int y){
        int swap = list.get(x);
        list.set(x,list.get(y));
        list.set(y,swap);
    }
}
