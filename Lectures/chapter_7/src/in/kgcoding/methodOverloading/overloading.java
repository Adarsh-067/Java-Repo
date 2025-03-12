package in.kgcoding.methodOverloading;

class overloading {

    overloading(){

    }

    overloading(String pop){
        return ;
    }

    int add(int a , int b){
        return a + b;
    }

    int add(int a , int b, int c){
        return a + b + c;
    }

    String add(String a , String b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        overloading loading = new overloading();
        System.out.println(loading.add(5,4));
        System.out.println(loading.add("adarsh","chaubey"));
        System.out.println(loading.add(5,4 , 5));

    }
}
