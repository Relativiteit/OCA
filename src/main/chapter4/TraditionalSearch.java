import java.util.*;

/**
 * @author Alejo Cain
 * @Date 22-09-2021 time 11:16
 */

public class TraditionalSearch {
    public static void main(String[] args) {
        List<SimpleLambda> smallLambs = new ArrayList<>(); // list of smallLambs
        smallLambs.add(new SimpleLambda("Shark", false, true));
        smallLambs.add(new SimpleLambda("SoftwareEngineer", true, true));
        smallLambs.add(new SimpleLambda("Dog", true, true));
        smallLambs.add(new SimpleLambda("projectManager", false, false));

        print(smallLambs, new CheckIfHopper());
    }
    private static void print(List<SimpleLambda> smallLambs, SimpleLambda.CheckTrait checker){
        System.out.println("These have more in common the you think: " );

        for (SimpleLambda lamb:smallLambs){
            if(checker.test(lamb))
                System.out.println(lamb + " " );

        }
        System.out.println();
    }
}
