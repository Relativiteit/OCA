package package2;

import package1.AccesModifier1;
// extending class makes it a subclass so you can use the methods
public class AccesModifier3 extends AccesModifier1 {

    public static void main(String[] args) {
        AccesModifier3 goat = new AccesModifier3();
        System.out.println(goat.getHours());
        System.out.println(goat.minutes);
    }
}
