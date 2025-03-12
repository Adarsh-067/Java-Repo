package in.Abstraction;

public abstract class Demo {
    String name;
    int age;
    boolean isMarried;

    public Demo(String name, int age,boolean isMarried){
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    public void demoMethod(){
        System.out.println("this is demo method in abstract class!");
    }

    public static void main(String[] args) {
        System.out.println("say Hello!☺");
        Demo d = new Demo("amit",18,false){
            @Override
            public void demoMethod() {
                super.demoMethod();
            }
        };
     d.demoMethod();
    }
}
