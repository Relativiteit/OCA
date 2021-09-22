package polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
// polymorphism use the data type of the superclass
        Car kuruma = new Car();
        Bycicle canyon = new Bycicle();
        Boat hydroBoat = new Boat();
        // also possible to use Objects[]
        Vehicle[] richOldGuys = {kuruma,canyon,hydroBoat};
        for(Vehicle trustFund : richOldGuys ){
            trustFund.go(); // applies to all elements in the array.

        }

    }
}
