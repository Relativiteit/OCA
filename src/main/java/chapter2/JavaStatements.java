
public class JavaStatements  {
    /**
     * if then
     * if-then-else
     * Ternary operator
     * Switch statement
     * While
     * Do-While
     * For */
    public static void main(String[] args) {
        // Usage of different java statements
        boolean bellyFull, bellyEmpty;
        int dogs, cats;
        int amount, portions;
        dogs = 8;
        cats = 10;
        portions = 12;
        bellyFull = true;
        bellyEmpty = false;


        {   // if then
            if (dogs < cats) {
                System.out.println("People will have to serve the new kings");
            }
            ;

            // if then else
            if (cats < portions) {
                System.out.println("Super angry cats");
            } else {
                System.out.println("The demons are fed ");
            }
            System.out.println("goat");

            // ternary opertor
            System.out.println((dogs <= portions) ? "Angry doggos" : "Happy doggos");

            // Switch statement
            RandomGenerator numRand = new RandomGenerator(20);
            for (int i = 0; i<25; i++){
                System.out.println(numRand.genRandomNumber());
                int goat = numRand.genRandomNumber();


                switch (goat) {
                    case 0:
                        System.out.println("Everyone is disappointment so the dogs and cats vow to eat all humans");
                    case 9:
                        System.out.println("This is a little bit better but still not enough food to make every one happy");
                    case (20):
                        System.out.println("There is enough food for all animals but they still dont trust you");
                    default:
                        System.out.println("Check if you entered something for amount");
                    case 4:
                        System.out.println("This is a small amount");
                        // while
                        while (dogs < portions && dogs < cats) {
                            dogs++;
                        }
                        System.out.println("Not enooug dogs");

                        // do while
                        if (bellyEmpty = false) {
                            do {
                                portions--;
                            } while (bellyFull = true);
                        }

                }
                }

            }
        }


    }
