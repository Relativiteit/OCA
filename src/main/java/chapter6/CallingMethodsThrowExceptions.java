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
    static void createArrays(int[] a){
        int[] smallArray = {2,5,7,8};

        for(int i : smallArray)
        {System.out.println(i);}
    }

    public static void main(String[] args) {
        inPutProblem();
        createArrays(new int[]{1, 2, 3, 4, 5});

    }
}