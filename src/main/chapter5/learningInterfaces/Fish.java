package learningInterfaces;
// have to implement the methos stated in the interface.

public class Fish implements Prey, Predator{
    @Override
    public void hunt() {
        System.out.println("The fish is big and hungry");

    }

    @Override
    public void flee() {
        System.out.println("This fish is swimming for it's life");

    }
}
