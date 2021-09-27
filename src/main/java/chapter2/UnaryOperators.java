public class UnaryOperators {
    /**
     * + Indicates a numbers is positive, although numbers are assumed to be positive in Java unless accompanied by a egative unary operator
     * - Indicates a literal numbers is negative or negtaes an expression
     * ++ Increments a value by 1
     * --
     */

    public static void main(String[] args) {
        double jobs, applications;
        int counter;
        double succesrate = 0.2;

        counter = 0;

        for(jobs = 1; jobs <= 400; jobs++){
            applications = jobs * succesrate;
            System.out.println("The succesfull applications is aprox this rate" + applications + "from about this many jobs " + jobs);

            counter ++;
            // every 5 lines print a empty line
            if(counter == 5)
            {
                System.out.println();
                counter = 0; // reset the counter
    }

    }
}}
