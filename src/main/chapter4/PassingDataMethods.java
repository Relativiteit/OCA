/**
 * @author Alejo Cain
 * @Date 22-09-2021 time 09:54
 */


public class PassingDataMethods {
    public static void main(String[] arg)
    {
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1);
        System.out.println(original2);
    }
    // passs by value
    public static void swap(int a, int b){
        int temp = a; // store original value in temporary variable.
        a = b;
        b = temp;
    }
}
