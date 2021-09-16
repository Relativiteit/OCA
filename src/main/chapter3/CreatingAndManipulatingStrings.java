import java.util.Locale;
import java.util.function.Function;

/**
 * @author Alejo Cain
 * @date 16-09-2021
 */
public class CreatingAndManipulatingStrings {
    public static void main(String[] args)
    {
        String name = "Fluffy";
        // concatenation
        String b = name + "a";
        b += 3;
        System.out.println(name);
        System.out.println(b);

        // Immutability
        class mutable{
            private String s;
            // setter
            public void setS(String newS){
                s = newS;}
            public String getS(){
                return s;}

                }
        final class VeryImmutable{
            private String s = "The Final Boss";
            public String getS() {
                return s;
            }

        }
        mutable goat = new mutable();
        System.out.println(goat.s);
        goat.setS("all hail Fluffy");
        System.out.println(goat.s);
        System.out.println(goat.getS());

        VeryImmutable sheep = new VeryImmutable();
        System.out.println(sheep);
        System.out.println(sheep.getS());
        // method chaining
        System.out.println(goat.s.toLowerCase().toUpperCase().length());
        System.out.println(sheep.getS().length());
        Function<VeryImmutable, String> veryImmutableStringFunction = (VeryImmutable c) -> {
            return c.getS();}; // ?????????????????




        System.out.println();
    }

}
