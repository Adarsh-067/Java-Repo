public class LogicalOP {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh Welcome to Java World!");

        String Graduation = "no";
        int is12thPercentage = 85;

        if (Graduation == "yes" && is12thPercentage >= 85){         // AND logical operator
            System.out.println("you are perfect to this job");
        }else {
            System.out.println("sorry, i can't help you");
        }

        if (Graduation == "yes" || is12thPercentage >= 85){         // OR logical operator
            System.out.println("you are perfect to this job");
        }else {
            System.out.println("sorry, i can't help you");
        }

        boolean isMarried = true;
        if (!isMarried){                                         // NOT logical operator
            System.out.println("hello");
        }else {
            System.out.println("hi");
        }
    }

}
