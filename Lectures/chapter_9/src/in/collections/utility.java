package in.collections;

import java.util.Collection;

public class utility {
      public static <E> void print(Collection<E> collection){
          System.out.print("Collection is: ");
          for (E coll : collection) {
              System.out.printf("%s ", coll.toString());
          }
          System.out.println();
      }
  }
