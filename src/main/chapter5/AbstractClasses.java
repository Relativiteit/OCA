/**
 * @author Alejo Cain
 * @Date 22-09-2021 time: 16:02
 */
// abstract class is used as the template for subclasses

abstract class Architect {
    public abstract String getName();
}
abstract class ExtendAbstract extends Architect{
    public abstract void code();
}
public class AbstractClasses extends ExtendAbstract {
    public String getName() {
        return "LeetCode";
    }
    public void code(){
        System.out.println("The coder is really load on her mechanical keyboard");
    }

    public static void main(String[] args) {
        Architect Jerome = new Architect() {
            @Override
            public String getName() {
                return null;
            }
        };
            Architect jeromeDeciple = Jerome;
        System.out.println(jeromeDeciple.getName());

        }
    }




