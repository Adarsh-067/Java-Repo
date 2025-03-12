package in.kgcoding.PassingReferenceAndValue;

public class PassByReference {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        point first = new point(5,5);
        System.out.println("first: " + first);
        move(first);
        System.out.println("first: " + first);

    }

    public static void move(point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static class point {
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}
