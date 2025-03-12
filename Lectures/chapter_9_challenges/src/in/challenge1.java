package in;

public class challenge1 {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        String result = concatenateStr("Adarsh","Chaubey","Banti","Chintu");
        System.out.println(result);
    }

    public static String concatenateStr(String... strs){
        StringBuilder sp = new StringBuilder();
        for (String str : strs) {
            sp.append(str).append(" ");
        }
        return sp.toString();
    }
}
