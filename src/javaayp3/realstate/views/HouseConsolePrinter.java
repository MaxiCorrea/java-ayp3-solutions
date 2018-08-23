package javaayp3.realstate.views;

import javaayp3.realstate.model.House;

class HouseConsolePrinter extends PropertyConsolePrinter {

  private final House house;

  HouseConsolePrinter(House house) {
    super(house);
    this.house = house;
  }

  @Override
  void print() {
    super.print();
    System.out.println("Garage : " + (house.hasGarage() ? "Si" : "No"));
    System.out.println("Pileta : " + (house.hasPool() ? "Si" : "No"));
    System.out.println("Quincho : " + (house.hasQuincho() ? "Si" : "No"));
    System.out.println("En Esquina : " + (house.inCorner() ? "Si" : "No"));
  }

}
