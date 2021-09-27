package package2;

import package1.AccesModifier1;
// extending class makes it a subclass so you can use the methods
public class AccesModifier3 {

    public static void main(String[] args) {
        AccesModifier1 Ravi = new AccesModifier1();

        AccesModifier3 goat = new AccesModifier3();

        System.out.println(Ravi.getHours());
        System.out.println(Ravi.getMinutes());

    }
}
