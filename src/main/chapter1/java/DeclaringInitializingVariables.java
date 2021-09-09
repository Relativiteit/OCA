import javax.swing.text.DefaultCaret;

public class DeclaringInitializingVariables {


    public DeclaringInitializingVariables(){
        boolean b1 = true;

    }
    public static void main(String[] args) {
        boolean b1;
        b1 = false;
        boolean b2;
        String s1 = "123thatsMyNUmber ";
        double d1, d2; // double d1, double d2, will not compile
        int i1; int i2;// this will compile because its seperated by semicolums (;)
        i1 = 4;
        i2 = 5;

        DeclaringInitializingVariables monkey = new DeclaringInitializingVariables();
        System.out.println(monkey);

        System.out.println(i1 + i2);

    }



}
