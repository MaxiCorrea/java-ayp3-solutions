package javaayp3.realstate;

import javaayp3.realstate.model.House;
import javaayp3.realstate.model.State;

public class RealEstateTester {

  public static void main(String[] args) {
    
    House house1 =  new House.Builder(1)
        .district("Moreno")
        .home("Cuartel")
        .surface(123)
        .antiquity(10)
        .state(State.REGULAR)
        .comissionForSale(34)
        .surfaceTerrain(123)
        .hasGarage(false)
        .hasPool(false)
        .hasQuincho(false)
        .inCorner(true)
        .build();
    
    House house2 =  new House.Builder(2)
        .district("Moreno")
        .home("Cuartel")
        .surface(234)
        .antiquity(12)
        .state(State.BAD)
        .comissionForSale(55)
        .surfaceTerrain(344)
        .hasGarage(true)
        .hasPool(false)
        .hasQuincho(false)
        .inCorner(false)
        .build();
    
    RealEstate estate = new RealEstate();
    estate.comparePricesAndPrint(house1 , house2);
  }

}
