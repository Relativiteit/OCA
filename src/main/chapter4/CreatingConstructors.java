/**
 * @author Alejo Cain
 * @Date 22-09-2021 time: 10:06 */

 class CreatingConstructors {
     private int numFingers;
     private int numGlasses;
     private int weight;

     // never called
     public CreatingConstructors(int weight) throws Exception {
         this(weight, 100); // calls constructor with 2 parameters
     }

     public CreatingConstructors(int weight, int getNumFingers) throws Exception {
         if( getNumFingers >= 10)
             throw new Exception("Not human!!");
         }
        // this(weight, getNumFingers, 10);

     public CreatingConstructors(int weight, int numFingers, int numGlasses){ // calls constructor with 3 parameters
         this.weight = weight;
         this.numFingers = numFingers;
         this.numGlasses = numGlasses;
     }

     public void neverLeaveLocalHost() {
         System.out.println(weight + " " + numFingers + " " + numGlasses);
     }

    public static void main(String[] args) throws Exception {

        CreatingConstructors Alejo = new CreatingConstructors(100, 11);
        Alejo.neverLeaveLocalHost();
        System.out.println(Alejo);
    }
}
