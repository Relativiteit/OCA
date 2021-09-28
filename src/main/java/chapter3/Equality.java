/**
 * @author Alejo Cain
 * @date 16-09-2021
 */
public class Equality {

    public static void main(String[] args) {

        // equal 2 ways == and .equals()
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;
        System.out.println(t1 == t3); // should result in true
        System.out.println(t1 == t2); // not pointing at the same object so false
        System.out.println(t1.equals(t3)); // true
        System.out.println(t3.equals(t2)); // false
        System.out.println(t1.age + t1.name);

    }

    static class Tiger{
        String name = "Tigger";
        int age = 1000;

    }
}

