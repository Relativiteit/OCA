import java.util.ArrayList;
import java.util.Date;

/**
 * @author Alejo Cain
 * @date 21-09-2021 time: 23:09
 */

public class SummaryChap3 {
    public static void main(String[] args)
    {
        // create arrayLIst
        ArrayList<String> mammals = new ArrayList<>();
        mammals.add("Dog");
        mammals.add("Sheep");
        mammals.add("Cow");
        mammals.add("Human");
        mammals.add("Human");
        System.out.println(mammals);

        ArrayList<String> hairyBoyos = mammals;

        //equals
        if(mammals.equals(hairyBoyos)){
            timeAnimal(); // call to function timeAnimal()
            System.out.println("Mammals on occasion are hairyBoyos" );
        }
        else{
            System.out.println("There is a intruder in the LIST !!!!");

        }
        System.out.println(mammals.equals(hairyBoyos));


    }
    public static void timeAnimal(){
        Date animalTime = new Date();
        long currentTime = animalTime.getTime();
        System.out.println(currentTime);

    }
}
