public class DefaultInitializingVariables

    /**
     * Variable types   -   Default initialization
     * boolean false
     * byte, short, int, long                   0
     * float, double                          0.0
     * char                                 '\u0000
     * All object references (everything else) null
     */
    {
        // outside methods the default values are initilized
        boolean Binu;

        public static void main(String[] args)
        // inside methods default values are not initialized
        {
            DefaultInitializingVariables Ravi ; // = new DefaultInitializingVariables();
            boolean b = new DefaultInitializingVariables().Binu;
            System.out.println(b + " b");
           // if (b + "b") you cannot do this because b is a false string
            System.out.println(new DefaultInitializingVariables().Binu);

            // System.out.println(Ravi.Ravi);
        System.out.println("Hello default values");
    };
}
