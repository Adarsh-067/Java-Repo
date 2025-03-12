package in.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionClass {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,5,6,3,2,4,12,10);
        utility.print(list);

        Collections.sort(list);
        utility.print(list);

        Collections.reverse(list);
        utility.print(list);

        List<Integer> nuModifiedList = Collections.unmodifiableList(list);
        utility.print(nuModifiedList);

//        nuModifiedList.add(56);
    }
}
