import java.util.Scanner;

/**
 * @author Alejo Cain
 * @Date 22-09-2021 time: 01:40
 */
// use varargs when the method input is variable

public class Varargs {

    String small = "Chibi";

    public String hungryMethod(String ...result) {
    Scanner tempo = new Scanner(System.in);
     result += tempo
        System.out.println(result.length());
        return result;


    }


    public static void main(String[] args) {
    hungryMethod();
        System.out.println("weird stuff ");

    }
}
