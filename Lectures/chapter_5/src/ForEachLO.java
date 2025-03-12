public class ForEachLO {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        String[][] names = {{"ram","mohan","shyam"},{"ravi","krishna","gopal"}};

        /*for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
        }*/

      /* int i = 0;
       while (i < names.length){
           System.out.println(names[i]);
           i++;
       }*/

        for (String[] name: names){
            System.out.println(name);
        }
    }
}
