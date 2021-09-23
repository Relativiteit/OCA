package trystatements;

import java.util.Scanner;

/**
 * @author Alejo Cain
 * @Date 22-09-2021 time: 17:25 */

public class TryStatement {
    public static void main(String[] args) {
    inPutProblem();

      //  int[] array = {1,4,5};
       // System.out.println(array[3]); // ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 4, 5};
            System.out.println(array[3]);
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("please check your input ");
        }}

    static void inPutProblem() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println(" ");
        }catch(Exception e){
            System.out.println("Please give a input: ");
        }
    }

}
