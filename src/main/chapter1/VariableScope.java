/**
 * @author Alejo Cain
 * @date 09-11-2021
 * @title variable scope
 */
public class VariableScope {

    public void eatMore(boolean hungry, int amountOfFood){
        int roomInBelly = 5;
        if(hungry){
            boolean timeToEat = true;
            while (amountOfFood > 0){
                int amountEaten =2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }

    }
    public static void main(String[] args)
{
    System.out.println("hello");

        }

}