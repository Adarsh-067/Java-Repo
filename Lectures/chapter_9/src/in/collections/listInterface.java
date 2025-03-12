package in.collections;

import java.util.ArrayList;
import java.util.List;

public class listInterface {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        List numList = new ArrayList();
        numList.add("adarsh");
        numList.add("chaubey");
        numList.add(450);

//        numList.add(1,"banti");
//        numList.addLast("panotha");
        numList.addFirst("chhatarpur");

        numList.remove("banti");
        numList.remove("panotha");

//        System.out.println(numList.get(2));

        numList.set(1,"anhs");

       /* if (numList.contains("banti")){
            System.out.println("yes");
        }*/

        System.out.println(numList.size());
        numList.clear();
        System.out.println(numList.size());


      /*  for (Object o : numList) {
            System.out.println(o);
        }*/
    }
}
