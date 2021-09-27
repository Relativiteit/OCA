import java.util.*;
import java.util.function.*;
/**
 * @author Alejo Cain
 * @Date 22-09-2021 time 11:57
 */
public class SummaryChap4 {
    public static void main(String[] args) {
        List<SimpleLambda> moreLambs = new ArrayList<>();
        moreLambs.add(new SimpleLambda("Monkey", true, false));
        moreLambs.add(new SimpleLambda("SwimmingSaru", true, true));

        System.out.println("These beauties can hop: ");
        print(moreLambs, knife -> knife.canHop());

        System.out.println("These guys can swim: ");
        print(moreLambs, knife -> knife.canSwim());
    }
    //   with predicate you don't need to make a interface
    private static void print(List<SimpleLambda> moreLambs, Predicate<SimpleLambda> checker) {
        for (SimpleLambda moreLamb : moreLambs) {
            if (checker.test(moreLamb))
                System.out.println(moreLamb + " ");
        }
        System.out.println();

    }
}