/**
 * @author ALejo Cian
 * @Date 22-09-20201 time: 10:15
 */
// Encapsulation only methods in the class with the variables can refer to the instance variables. Callers are required to use these methods.

/**
 * Java Beans
 * Properties are private private int numEggs;
 * Getter methods begin with is or get if the property is a boolean public boolean is happy() { return happy;}
 * Getter methods begin with get if the property is not a boolean public int getNumEggs() { return numEggs;}
 * Setter methods begin with set. public void setHappy(boolean happy){this.happy = happy;}
 * The method name must have a prefix of set/get/is, followed by the first letter of the property in uppercase, followed by the rest of the property name. public void setNumEggs9int num) { numEggs = num;}
 */
public class EncapsulatingData {
    private int numberOfHoursworked; // private keeps the access to the java file
    public int getNumberOfHoursWorked(){
        return numberOfHoursworked;
    }
    public void setNumberOfHoursworked(int numberOfHoursworked){
        if (numberOfHoursworked >= 0){ // guard condition, can't have lazy individuals
            this.numberOfHoursworked = numberOfHoursworked;
        }
    }

    public static void main(String[] args) {

        EncapsulatingData Harry = new EncapsulatingData();
        int loyalty =  Harry.getNumberOfHoursWorked();
        Harry.setNumberOfHoursworked(160);
        if(Harry.numberOfHoursworked <= 40){
            System.out.println("lazy pig");}
        else {
            System.out.println("Hard work will pay the boss his new boat!");
    }



}}
