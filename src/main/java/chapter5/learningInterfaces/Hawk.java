package learningInterfaces;
// hawk class now has to use methods stated in Predator interface
public class Hawk implements Predator{
    @Override
    public void hunt() {
        System.out.println("The Hawk is hunting");

    }
}
