package in.GenriceAndDimenodOperator;

public class Generic<T> {
    private T thing;

    public T getThing() {
        return thing;
    }

    public void setThing(T thing){
        this.thing = thing;
        System.out.println("Say Hi!☺");
    }

    public static void main(String[] args) {
        System.out.println("Hello, :)");
        Generic g = new Generic();
        g.setThing("Adarsh");
        System.out.println(g.thing);

        g.setThing(15);
        System.out.println(g.thing);
        g.getThing();

        g.setThing(5.4235);
        g.getThing();

    }


   /* public Generic(T thing)
    {
        this.thing = thing;
    }*/

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Generic{");
        sb.append("thing=").append(thing);
        sb.append('}');
        return sb.toString();
    }
}
