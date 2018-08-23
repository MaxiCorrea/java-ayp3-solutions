package javaayp3.realstate;

public class RealEstateTester {

  public static void main(String[] args) {
    Property house1 = new House(1, "Moreno", "Cuartel", 123, 10, 2, 34, 123, false, false, false, true);
    Property house2 = new House(2, "Moreno", "Cuartel", 234, 12, 3, 55, 344, true, false, false, false);
    RealEstate estate = new RealEstate();
    estate.comparePricesAndPrint(house1 , house2);
  }

}
