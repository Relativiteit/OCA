import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Alejo Cain
 * @Date 27-09-2021 time 02:30
 */
import static java.lang.System.in;

public class CommonExceptionsTypes {
    private static int numberEggs;
    // 3 common exception types, Runtime exceptions, Checked exceptions, Errors
    /**
     * Runtime Exceptions: ArithmeticException, ArrayIndexOUtofBoundsException, ClassCastException, IllegalArgumentException NUllPointerException, NUmberFormatException.
     * Checked Exceptions: FileNotFoundException, IOException
     * Errors: ExceptionInInitializerError, StackOverflowError, NoClassDefFoundError,
     */
    public static void ArithmeticException(){
        try {
            int answer = 11 / 0;
        System.out.println(answer);}
        catch(ArithmeticException e) {
            System.out.println("Dont divide with 0 ");
        }
    }
    public static void ArrayOUtBoundException(){
    try{
        int[] countOfMoose = new int[3];
        System.out.println(countOfMoose[-1]);}
    catch (ArrayIndexOutOfBoundsException e ){
        System.out.println("key is out of bound for this array please check value");
    }}

    public static void ClasscastException(){
        try{
            String type = "Mooose";
            // Integer number = (Integer) type; // cant even catch the error?
            int number = 5;

    }catch(ClassCastException d){
            System.out.println("Can't cast a String to a integer");
        }}
public static void IllegalargumentssException(int numberEggs){
        try {
            if (numberEggs >= 0 ) ;}// guard condition
        catch( IllegalArgumentException e ){  // why does it not trigger ??
            System.out.println("Please check your arguments are positive");
    }
}
public static  void NullPointExcept() throws NullPointerException{
    String name = "ravi";
    System.out.println(name.length());{
    }
}

public static void NumberFormatExcept(){
        try{
    System.out.println( Integer.parseInt("abc"));}
        catch (NumberFormatException e){
            System.out.println("trying to parse a string with a string parse method !");
        }
}
public static void FileNotFoundException(){
        try{
            Scanner in = new Scanner(new FileReader("RaviNotFound.txt"));
            StringBuilder sb = new StringBuilder();
            while(in.hasNext()) {
                sb.append(in.next());
            }
            in.close();
            String outString = sb.toString();}
        catch(FileNotFoundException e){
            System.out.println("Check your file pathing, we can't find anything right now.");

        }
    }
    public static void IOException(){
        try{
            Scanner in = new Scanner(new FileReader("BinuNotFound.txt")); // file not available

        }catch(IOException e){
            System.out.println("Check your network, local file, stream, file permissions, disk space");
    }}
    public static void ExceptionInINtializerError()
    { try{
    int[] countOfMoose = new int[3];
    int num = countOfMoose[-1];}
    catch (ExceptionInInitializerError f){
        System.out.println("Even errors can be caught!!");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Check your input for array call");}
    }

    public static void StackOVerflowErrpr(int num ){
        try{
            StackOVerflowErrpr(1);
        } catch(StackOverflowError e) {
            System.out.println("Dark side recursion");
        }
    }

    public static void NoCLassDefFOundError(){
        System.out.println("There is a class so no worries fam ");}

    public static void main(String[] args) {
        // Runtime Exceptions
        ArithmeticException();
        ArrayOUtBoundException();
        ClasscastException();
        IllegalargumentssException(-2);
        NullPointExcept();
        NumberFormatExcept();

        // Checked Exceptions
        FileNotFoundException();
        IOException();

        // Errors
        ExceptionInINtializerError();
        StackOVerflowErrpr(1);
        NoCLassDefFOundError();











    }
}
