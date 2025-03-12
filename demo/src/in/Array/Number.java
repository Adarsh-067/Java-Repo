package in.Array;

class Number {
    int num;

    Number(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("number: ").append(num);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello, welcome to object array concept!");

        Number[][] num = new Number[2][2];

        num[0][0] = new Number(1);
        num[0][1] = new Number(2);
        num[1][0] = new Number(3);
        num[1][1] = new Number(4);

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.println(num[i][j]);
            }
        }
    }
}
