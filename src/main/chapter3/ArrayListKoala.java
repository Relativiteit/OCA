import java.util.ArrayList;
public class ArrayListKoala  {
    public static void main(String[] args)
    // create List
    {ArrayList<String> fruits = new ArrayList<>();
        // add to list
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("appel");
        fruits.add("cheese");

        System.out.println(fruits);
        //removal of elements

        fruits.remove("appel");
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);

    }


}
