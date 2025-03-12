package in;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class challenge2 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        List<String> list = Arrays.asList("Lion","Bear","Ant","Monkey","Cat");
        System.out.println(list);
        sortingObj(list);
        System.out.println(list);

    }

    public static void sortingObj(List<String> stringList){
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 0;
                }else if (o1.charAt(0) < o2.charAt(0)){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
    }

    /*public static void sortingObj(List<String> stringList){
        Collections.sort(stringList);
    }*/
}
