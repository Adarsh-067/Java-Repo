package in;

public class testEnum {
        public static void main(String[] args) {
            System.out.println("Hello, Adarsh welcome to java world!\n");

       /* Day day = Day.MONDAY;
        System.out.println(day.getType());*/

            for (Day day : Day.values()) {
                System.out.printf("%s : %s \n",day,day.getType());
            }
        }
    }


