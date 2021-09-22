/**
 * @author Alejo Cain
 * @Date 22-09-2021 time: 11:12
 */

public class SimpleLambda {
    /
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public SimpleLambda(String speciesName, boolean hopper, boolean swimmer){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    public boolean canHop() {
        return canHop;}
    public boolean canSwim() {
        return canSwim;}
    public String toString() {
        return species;}

    public interface CheckTrait{
        boolean test(SimpleLambda a);
    }


}
