 class diceRoll {
    // dice roll using math.

   public int Roll(){
        return (int) Math.round(Math.random()*6);
    }

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        diceRoll dice = new diceRoll();
        for (int i = 0; i < 6; i++) {
            System.out.println(dice.Roll());
        }
    }
}
