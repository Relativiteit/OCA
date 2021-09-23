import java.util.Scanner;

public class CallingMethodsThrowExceptions {


    static void inPutProblem() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println(" ");
        } catch (Exception e) {
            System.out.println("Please give a input: ");
        }
    }

    public static void main(String[] args) {
        inPutProblem();

    }

}