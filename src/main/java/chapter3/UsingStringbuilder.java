/**
 * @author Alejo Cain
 * @date 16-09-2021
 */

public class UsingStringbuilder {
    public static void main(String[] args)
    {
        // creation, creation with args, creation with varargs
        StringBuilder item1 = new StringBuilder();

        // contains string dobotsu
        StringBuilder item2 = new StringBuilder("dobotsu");
        // has capacity of 10 chars
        StringBuilder item3 = new StringBuilder(10);
        System.out.println(item3.length()); // 0

        // append()
        item3.append("milk");
        System.out.println(item3.length()); // 4
        // indexof()
        System.out.println(item3.indexOf("k")); // get index of the letter k

        // System.out.println(item1.insert(0, "oogaaa"));; // not possible capacity is 0
        System.out.println(item2.insert(0, "floopy"));
        System.out.println(item1.append("nice"));

        System.out.println(item2);
    }
}
