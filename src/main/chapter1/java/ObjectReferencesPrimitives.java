public class ObjectReferencesPrimitives {

    static String name = " test";
    boolean questionLife;
    private int numObjects = 5;
    double numberDouble = 2.0;
    float numberFloat = 3.0f;
    long numberLong = 4043;
    short numberShort = 2;
    /**
     * Primitives   -   Default
     * Boolean      -   False
     * Int          -   0
     * double       -   0.0
     * float        -   0F
     * long         -   0L  small l works too but use big L for readability
     * short        -   0
     * string       -   null
     */

   public ObjectReferencesPrimitives() {
       name = "Japanese";
       numObjects = 20;
       questionLife = true;
       numberDouble = 3.0;
       numberFloat = 5.0f;
       numberLong = 60000;
       numberShort = 1;
    }
    public static void main(String[] args)
    {
        ObjectReferencesPrimitives garden = new ObjectReferencesPrimitives();
        System.out.println(garden.name);
        System.out.println(garden.numberFloat);
        System.out.println(garden.numObjects);
    }

}
