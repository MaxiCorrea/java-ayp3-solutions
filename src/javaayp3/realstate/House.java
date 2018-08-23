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
        coefficientHouse = GOOD_HOUSE_COEFFICIENT;
        break;
      case 2:
        coefficientHouse = REGULAR_HOUSE_COEFFICIENT;
        break;
      case 3:
        coefficientHouse = BAD_HOUSE_COEFFICIENT;
        break;
    }

    if (getAntiquity() < 15) {
      coefficientHouse *= GOOD_HOUSE_COEFFICIENT;
    } else if (getAntiquity() < 35) {
      coefficientHouse *= REGULAR_HOUSE_COEFFICIENT;
    } else {
      coefficientHouse *= BAD_HOUSE_COEFFICIENT;
    }

    if (hasGarage()) {
      coefficientHouse *= GARAGE_HOUSE_COEFFICIENT;
    }

    if (hasPool()) {
      coefficientHouse *= POOL_HOUSE_COEFFICIENT;
    }

    if (hasQuincho()) {
      coefficientHouse *= QUINCHO_HOUSE_COEFFICIENT;
    }

    if (inCorner()) {
      coefficientTerrain *= GROUND_TERRAIN_COEFFICIENT;
    }

    return getSurface() * BASIC_VALUE_HOUSE * coefficientHouse
        + getSurfaceTerrain() * BASIC_VALUE_BUILD_GROUND * coefficientTerrain;
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
