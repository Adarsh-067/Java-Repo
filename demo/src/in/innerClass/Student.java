package in.innerClass;

public class Student {
    private String name;
    private double percentage;

    public String getName() {
        return name;
    }

    public Student(String name, double percentage){
        this.name = name;
        this.percentage = percentage;
    }

    static class standard{
         public int standard;

         public standard(int standard){
             this.standard = standard;
         }
    }

    class Result {
        public void pass(){
            if (percentage > 33){
                System.out.println(name + " your result is pass!");
            }else {
                System.out.println(name + " your result is fail!");

            }
        }
    }
}
