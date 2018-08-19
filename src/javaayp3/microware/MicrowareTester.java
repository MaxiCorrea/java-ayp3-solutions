package javaayp3.microware;

public class MicrowareTester {

  public static void main(String[] args) {
    Microware microware = new Microware();
    microware.setTime(120);
    microware.setPower(700);
    System.out.println("Andando : " + microware.isRunning());
    microware.startOfCooking();
    System.out.println("Andando : " + microware.isRunning());
    System.out.println("Tiempo coccion : " + microware.getRemainingTime());
    System.out.println("Tiempo potencia : " + microware.getPower());
    System.out.println("Tiempo restante : " + microware.getRemainingTime());
    microware.stopCooking();
    System.out.println("Andando : " + microware.isRunning());
    System.out.println("Tiempo coccion : " + microware.getRemainingTime());
  }
  
}
