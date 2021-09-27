public class SummaryChap6 {

    // combination of things learned from chapter 6
    public static void makeTrouble(){
        try{
            int[] goat = {1,2,34,5};
        System.out.println(goat[6]);}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Check your index");
        }
    }

    public static void main(String[] args) {
        int age = 5;
        int goat = 100;
        String programmer = "Pikachu";
        for(int i = 0; age < goat; i++){
            age += 1;
            makeTrouble(); // called method
        }


    }
}
