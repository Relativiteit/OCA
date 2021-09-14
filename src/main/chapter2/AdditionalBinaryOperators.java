public class AdditionalBinaryOperators {
    public static void main(String[] args){
        /**
         * Overflow and underflow
         * Casting Primitive values
         *
         */
        int g = (int)1.0;
        System.out.println(g);
        short e = (short)1921222; // stored as maximum value of short
        int f = (int)9f;
        long t = 199_992_312_33L; // use the big L small l is also possible but looks like a one
        System.out.println(e);
        System.out.println(f);
        System.out.println(t);

        short x = 10;
        short y = 3;
        //short z = y * x ; incompatible types short * short will be promoted to int
        int z = y * x;
        System.out.println(z);







    }
}
