import javax.swing.text.DefaultCaret;

public class DeclaringInitializingVariables {
    public boolean b1 = true;


    public DeclaringInitializingVariables(){
    b1 = false;

    }
    public static void main(String[] args) {
       boolean b1;
       b1 = true;
        boolean b2;
        String s1 = "123thatsMyNUmber ";
        double d1, d2; // double d1, double d2, will not compile
        int i1; int i2;// this will compile because its seperated by semicolums (;)
        i1 = 4;
        i2 = 5;

        DeclaringInitializingVariables monkey = new DeclaringInitializingVariables();
        System.out.println(monkey.b1 + " " +  b1);

        System.out.println(i1 + i2);

    }



}
