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
    public int getHours() {
        return hours;
    }
    public int getMinutes() { return minutes;}
    // public int setHours(int hours) { this.hours = hours; }
    // accces the variable Rave.minutes see what happens, protected, private, default 1
    // reverse the access from Accesmodifier3 to this file make more functions in all and play wiht access.
}
