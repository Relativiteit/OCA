import java.util.ArrayList;

/**
 * @author Alejo Cain
 * @date 18-09-2021
 */
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

        // forEach loop through arrayList
        fruits.forEach((fruit) -> print(fruit));

        fruits.clear();
        System.out.println(fruits);

    }
public static void print(String fruit){
    System.out.println("We have these items for sale " + fruit);
}

}
