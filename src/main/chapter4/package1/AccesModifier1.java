package package1;

/**
 * @author Alejo Cain
 * @Date 22-09-2021 time: 02:06
 */
public class AccesModifier1 {

    // default, public, private and protected
    // protected gives access within the package
    protected int hours = 3;
    protected int minutes = 47;
    // private keeps the access to the java file
    protected int getHours() {
        return hours;
    }
}
