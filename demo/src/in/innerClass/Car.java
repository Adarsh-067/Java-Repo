package in.innerClass;

public class Car {
    private  String model;
    private boolean isEngineOn;

    public String getModel() {
        return model;
    }

    public Car(String name){
        this.model = name;
    }

      class Engine {     //member inner class
        public void start(){
            class FuelCheck {         // local inner class
                  public int fuel;

                 public FuelCheck(int fuel){
                      this.fuel = fuel;
                  }

                  public boolean isFuel() {
                      if (fuel > 1) {
                          return true;
                      }
                      return false;
                  }
            }

            FuelCheck fuel = new FuelCheck(2);

            if (fuel.isFuel()){
                if (!isEngineOn) {
                    isEngineOn = true;
                    System.out.println(model + " engine is start!");
                }else {
                    System.out.println(model + " engine is already start!");
                }
            }else {
                System.out.println(model + " fuel is low!");
            }
        }

        public void stop(){
            if (isEngineOn){
                isEngineOn = false;
                System.out.println(model + " engine is stop!");
            }
        }

    }
}
