import java.util.ArrayList;
public class Main {
    public static void main(String[] args){

        //ArrayList<String> fruits = new ArrayList<>();
        //fruits.add("Apple");
        //fruits.add("Banana");
        //fruits.add("Orange");

        Box<String> box = new Box<>();      //We set up a parameter type because our box class wants to know what we are storing in it.
        box.setItem("Apple");
        IO.println(box.getItem());


        Product<String, Double>product1 = new Product<>("Banana", 0.60);
        Product<String, Integer>product2 = new Product<>("apple", 5);

        IO.println(product1.getItem());
        IO.println(product2.getPrice());

    }
}
