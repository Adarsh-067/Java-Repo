public class IfElse {
    public static void main(String[] args) {
        // if else statement (conditional statement)
        boolean isFollow = false;
        if (isFollow){
            System.out.println("congress");
        }else {
            System.out.println("follow now");
        }

        // nesting if else statement

        boolean isPass = true;
        boolean isMoreThan60Per = true;
        if (isPass){
            if (isMoreThan60Per){
                System.out.println("congratulation");
            }
        }else {
            System.out.println("try again");
        }
    }
}
