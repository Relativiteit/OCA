/**
 * @author Alejo Cain
 * @Date 22-09-2021 time:10:03
 */

public class OverloadingMethods {
    /*
    Finding the right overloading method
    Exact match by type public String run(int i, int j)  {}
    Larger primitive type public String run(long i, long j){}
    Autoboxed type public String run(Integer i, Integer j){}
    Varargs public String run(int... nums){}
     */



    public static String run(String s){
        return "1";
    }
    public static int run(int s){
        return 1;
    }
    // Varargs
    public static String run(String...s){
        return "2";
    }
    public static String run(Object o){
        return "3";
    }
    public static String run(String s, String t){
        return "4";
    }

    public static void main(String[] args) {
        System.out.println(run("a)")); // normal function
        System.out.println(run("a", "b")); // use 2 parameters
        System.out.println(run("a", "b", "c")); // using varargs

    }
}
