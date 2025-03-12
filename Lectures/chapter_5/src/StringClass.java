public class StringClass {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        StringBuilder sb = new StringBuilder("This is my first stringBuilder");
        sb.append(", hello ");
        sb.append(45);
        sb.append(" this is for you");

        System.out.println(sb);
    }
}
