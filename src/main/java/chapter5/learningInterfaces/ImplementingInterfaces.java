package learningInterfaces;

/**
 * @author Alejo Cain
 * @Date 22-09-2021 time: 16:26
 */
public class ImplementingInterfaces {
    public static void main(String[] args) {
        Rabbit usagi = new Rabbit();
        usagi.flee();
        Hawk hayabusa = new Hawk();
        hayabusa.hunt();
        Fish sakana = new Fish();
        sakana.flee();
        sakana.hunt();


        /**
         * 1. Interfaces cannot be instantiated directly.
         * 2. An interface is not required to have any methods.
         * 3. An interface may not be marked as final.
         * 4. ALl top-level interface are assumed to have public or default acces. They are assumed to be abstract else compiler error.
         * 5. Non default methods in a interface are assumed to have the modifiers abstract and public in their definition.
         * Rule 4. does not apply to inner interfaces.
         */
        // an interface is an abstract data type that defines a list abstract public methods that any class implementing the interface must provide.

    }
}
