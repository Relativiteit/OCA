/**
 * @author Alejo Cain
 * @Date 22-09-2021 time 12:16
 */

 class Roadbike {
        // only 1 level inheritance
        public int gear;
        public int speed;

        public Roadbike(int gear, int speed){
            this.gear = gear;
            this.speed = speed;
        }
        // RoadBike has 3 methods
        public void applyBrake(int decrement)
        {
            speed -= decrement;
        }

        public void speedUp(int increment)
        {
            speed += increment;
        }
        public String toString(){
            return("Number of gear are" + gear + "\n" + "speed of bicycle is " + speed);
        }
    }

class GravelBike extends Roadbike {

    // the GravelBIke subclass adds one more field
    public int seatHeight;

    // the GRavelBike subclass has one constructor
    public GravelBike(int gear, int speed, int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the GRavelBike subclass adds one more method
    public void setSeatHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // Overriding toString() method of ClassInheritance for more info.
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}

// public class with driver(main) class
public class ClassInheritance {
     public static void main(String args[])
     {
         GravelBike CanyonGrail = new GravelBike(22, 40, 30);
         System.out.println(CanyonGrail.toString());

     }
}