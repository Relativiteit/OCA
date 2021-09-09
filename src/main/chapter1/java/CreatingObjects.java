public class CreatingObjects {
    private String name = "Fried rice";
    {System.out.println("Making a new dish");}

    // constructor
    public CreatingObjects(){
        name = "Chahan";
        System.out.println("Setting Constructor");}

    // main function to run it all
    public static void main(String[] args) {

        // type, variable name, new constructor
        CreatingObjects aObject = new CreatingObjects();
        System.out.println(aObject.name);

    }

}
