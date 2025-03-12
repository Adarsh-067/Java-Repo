package in.Enum;

 enum trafficLight {
     RED("stop"), GREEN("run"), YELLOW("z-crossing");

     private String action;

     trafficLight(String action){
         this.action = action;
     }

     public String getAction() {
         return action;
     }
 }
