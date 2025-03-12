package demo;

 class Car {
   public String name;
   private int costPriceOfCar;

   public Car(String name,int costPriceOfCar){
        this.name = name;
        this.costPriceOfCar = costPriceOfCar;
    }

    Car(){}

    String Hello(){
        return "Hello " + this.name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", costPriceOfCar=").append(costPriceOfCar);
        sb.append('}');
        return sb.toString();
    }
}
