/**
 * @author Alejo Cain
 * @date 21-09-2021 Time: 23:07
 */

public class javaArrays {
    public static void main(String[] args)
    {
        int[][] numbers = { {1,2,3,4}, {5,6,7}};
        // for loop
        for(int i = 0; i < numbers.length; ++i){
            // nested for loop
            for(int j = 0; j < numbers[i].length; ++j){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
