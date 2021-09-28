/**
 * @author Alejo Cain
 * @Date 22-09-2021 time: 01:09
 */

public class DesigningMethods {
    String name;
    int age;
    // constructor
    public static String DesigningMethods(){
        String name = "GOofy";
        String designName = name;
        return designName;
        }

        // Methods
        public static void noReturns(){
        int age = 0;
        age += 1;
            System.out.println("age: " + age);

        };

        public static void main(String[] args) {
            int counters = 0;
            DesigningMethods();
            if(counters == 2 ){
                System.out.println("Please check if you spelled correctly");}
            else if (DesigningMethods() ==  "GOofy") {
                counters += 1;
                System.out.println("Tadashi desu");
                System.out.println("amount of loops: " + counters);
                noReturns();
        }

    }
}
