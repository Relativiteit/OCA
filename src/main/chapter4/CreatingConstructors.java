/**
 * @author Alejo Cain
 * @Date 22-09-2021 time: 10:06 */

 class CreatingConstructors {
     private int numFingers;
     private int numGlasses;
     private int weight;

     // never called
     public CreatingConstructors(int weight){
         this(weight, 100); // calls constructor with 2 parameters
     }

     public CreatingConstructors(int weight, int getNumFingers){
         this(weight, getNumFingers, 10); // calls constructor with 3 parameters
     }
     public CreatingConstructors(int weight, int numFingers, int numGlasses){
         this.weight = weight;
         this.numFingers = numFingers;
         this.numGlasses = numGlasses;
     }

     public void neverLeaveLocalHost() {
         System.out.println(weight + " " + numFingers + " " + numGlasses);
     }

    public static void main(String[] args) {
        CreatingConstructors Alejo = new CreatingConstructors();
        Alejo.neverLeaveLocalHost();
    }
}
