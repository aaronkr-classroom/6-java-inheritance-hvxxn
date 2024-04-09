public class Ex803 {
public static void main(String[] args){
    Car sf = new Car();
    EvCar x = new EvCar();

sf.printDetails();

for (int i = 0; i < 6; i++ ) {
    sf.drive();
}
System.out.println("You have " + sf.getTank() + 
"L of oil left.");
System.out.println("You drove " + sf.getKm() + "km.");


x.printDetails();

for (int i = 0; i < 6; i++ ) {
    x.drive();
}

System.out.println("You have " + x.getCharge() + 
"% battery left.");
System.out.println("You drove " + x.getKm() + "km.");
    }
}