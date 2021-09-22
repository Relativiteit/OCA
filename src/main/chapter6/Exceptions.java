import java.util.EmptyStackException;

/**
 * @author Alejo Cain
 * @Date 22-09-2021 time: 17:07
 */
public class Exceptions {
    int size = 0;
    /**
     * Type of exceptions
     * Runtime exception Subclass of Exception
     * Checked exception Subclass of exception but not subclass of RUntimeExeption
     * Error Subclass of Error
     */
    // throwing an exception
    public static Object pop(){
        Object obj = null;
        int size = 0;
        if(size == 0) {
            throw new EmptyStackException();
        }
        objectAt(size -1);
        setObjectAt(size -1);
        size--;
        return obj;
    }

    public static void objectAt(int...args){
        System.out.println();
    }
    public static void setObjectAt(int...args) {
        System.out.println("Hello world!");
    }
    public static void main(String[] args) {
        pop();
    }
}
