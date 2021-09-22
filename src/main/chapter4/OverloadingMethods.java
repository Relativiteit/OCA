public class OverloadingMethods {
    public static String run(String s){
        return "1";
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
