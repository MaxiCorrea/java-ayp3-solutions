package javaayp3.realstate;

class House extends Property {

  private int surfaceTerrain;
  private boolean hasGarage;
  private boolean hasPool;
  private boolean hasQuincho;
  private boolean inCorner;

  House(int code, String district, String home, int surface, int antiquity, int state,
      int commissionForSale, int surfaceTerrain, boolean hasGarage, boolean hasPool,
      boolean hasQuincho, boolean inCorner) {
    super(code, district, home, surface, antiquity, state, commissionForSale);
    this.surfaceTerrain = surfaceTerrain;
    this.hasGarage = hasGarage;
    this.hasPool = hasPool;
    this.hasQuincho = hasQuincho;
    this.inCorner = inCorner;
  }

  int getSurfaceTerrain() {
    return surfaceTerrain;
  }

  boolean hasGarage() {
    return hasGarage;
  }

  boolean hasPool() {
    return hasPool;
  }

  boolean hasQuincho() {
    return hasQuincho;
  }

  boolean inCorner() {
    return inCorner;
  }

  @Override
  double salePrice() {
    double coefficientHouse = 1;
    double coefficientTerrain = 1;
    switch (getState()) {
      case 1:
        coefficientHouse = goodHouseCoefficient;
        break;
      case 2:
        coefficientHouse = regularHouseCoefficient;
        break;
      case 3:
        coefficientHouse = badHouseCoefficient;
        break;
    }

    if (getAntiquity() < 15) {
      coefficientHouse *= goodHouseCoefficient;
    } else if (getAntiquity() < 35) {
      coefficientHouse *= regularHouseCoefficient;
    } else {
      coefficientHouse *= badHouseCoefficient;
    }

    if (hasGarage()) {
      coefficientHouse *= coefficient_house_garage;
    }

    if (hasPool()) {
      coefficientHouse *= coefficient_house_pool;
    }

    if (hasQuincho()) {
      coefficientHouse += coefficient_house_quicho;
    }

    if (inCorner()) {
      coefficientTerrain += Ground_terrain_coefficient;
    }

    return getSurface() * basicHouseValue * coefficientHouse
        + getSurfaceTerrain() * basicValueBuiltGround * coefficientTerrain;
  }

  @Override
  void printAttributes() {
    super.printAttributes();
    System.out.println("Garage : " + (hasGarage() ? "Si" : "No"));
    System.out.println("Pileta : " + (hasPool() ? "Si" : "No"));
    System.out.println("Quincho : " + (hasQuincho() ? "Si" : "No"));
    System.out.println("En Esquina : " + (inCorner() ? "Si" : "No"));
  }
  
}
