package in.Abstraction.Animal;
public abstract class Animal {
   private String age;
   private String bread;
   private String animalName;

   protected Animal(String animalName){
        this.animalName = animalName;
    }

   public abstract void sayHello();

    public void sleep(){
        System.out.println(animalName + " Zzz...");
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
