/**
 * @author Alejo Cain
 * @Date 22-09-2021 time 11:16
 */
public class CheckIfHopper implements SimpleLambda.CheckTrait {

    public boolean test(SimpleLambda a) {
        return a.canHop();
    }
}
