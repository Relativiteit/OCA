public class AdditionalBinaryOperators {
    public static void main(String[] args)
    /**
     * Other unary operators ~, +, -,!
     * Multiplixction/Division/MOdulus *,/,%
     * ADdition/Subtraction +,-
     * Shift operators <<,>>,>>>
     * Relational operators <,>,<=,>=, instance of
     * Equal to/not equal to ==, !=
     * Logical operators &,^,|
     * Short-circuit logical operators &&,||
     * Ternary operators boolean expression ? expression1 : expression2
     * Assignment operator  =, +=, -=, *=, /=, %=, |=, <<=,>>=,>>>=
     *
     * Post-unary operators expression++, expression --
     * Pre-unary operators ++expresion, --expresion
     *
     */
    { // modulus
        System.out.println(10 / 3);
        System.out.println(10 % 3);
        System.out.println(11 /3 );
        System.out.println( 12 / 3);
        System.out.println(12 % 3);

        // data promotion  x * y / z

        short x = 14;
        float y = 13;
        double z = 30;
        Typetester test = new Typetester();
        double k = x * y / z;
        //System.out.println((test.printType(k))); // void type not allowed?
        System.out.println(x * y/ z );



    }

    static class Typetester {
        void printType(byte x) {
            System.out.println(x + " is an byte");
        }
        void printType(int x) {
            System.out.println(x + " is an int");
        }
        void printType(float x) {
            System.out.println(x + " is an float");
        }
        void printType(double x) {
            System.out.println(x + " is an double");
        }
        void printType(char x) {
            System.out.println(x + " is an char");
        }
    }

}
