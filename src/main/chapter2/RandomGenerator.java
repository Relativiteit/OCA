// instead of using java.util.Random make a random number generator for the javaStatements

/**
 * Linear congruential generator is a pseudorandom number generator just like java.util.random
 * These can be used in simple programs but not for cryptography
 * @author Alejo Cain
 * @Date: 17-09-2021
 */
public class RandomGenerator {

    public static void main(String[] args) {
    RandomGenerator numRand = new RandomGenerator(10);
    for (int i = 0; i < 25; i++){
        System.out.println(numRand.genRandomNumber());
    }

}
private int max;
private int last;

// constructor
public RandomGenerator(int max){
        this.max = max;
        last = (int) (System.currentTimeMillis() % max);
    }

    public int genRandomNumber(){
        last = (last * 32719 + 3) % 32749; // 2 big prime numbers they can be whatever as long as it's prime number
        return last % max;

    }

}
