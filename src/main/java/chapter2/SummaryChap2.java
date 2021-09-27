import java.util.Scanner;

/**
 * @author Alejo Cain
 * @Date 14-09-2021
 */
public class SummaryChap2 {
    public static void main(String[] args) {
        char operator;  // make variable operator
        Double number1, number2, result;

        //create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask user for input
        System.out.println("Choose an operator: +,-,* or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter the first number");
        number1 = input.nextDouble();

        System.out.println("Enter the second number");
        number2 = input.nextDouble();

        // make cases for all operators

        switch (operator) {

            // Do addition
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + "= " + result);
                break;
            // Do addition
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + "= " + result);
                break;
            // Do addition
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            // Do addition
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + "= " + result);
                break;

        }
    }
}
