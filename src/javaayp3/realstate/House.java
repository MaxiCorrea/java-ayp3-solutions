package javaayp3.realstate;

class House extends Property {

  private int surfaceTerrain;
  private boolean hasGarage;
  private boolean hasPool;
  private boolean hasQuincho;
  private boolean inCorner;

  private House(Builder builder) {
    super(builder);
    this.surfaceTerrain = builder.surfaceTerrain;
    this.hasGarage = builder.hasGarage;
    this.hasPool = builder.hasPool;
    this.hasQuincho = builder.hasQuincho;
    this.inCorner = builder.inCorner;
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

  static class Builder extends Property.Builder<Builder> {

    private int surfaceTerrain;
    private boolean hasGarage;
    private boolean hasPool;
    private boolean hasQuincho;
    private boolean inCorner;

    public Builder(int code) {
      super(code);
    }

    Builder surfaceTerrain(int surfaceTerrain) {
      this.surfaceTerrain = surfaceTerrain;
      return self();
    }

    Builder hasGarage(boolean hasGarage) {
      this.hasGarage = hasGarage;
      return self();
    }

    Builder hasPool(boolean hasPool) {
      this.hasPool = hasPool;
      return self();
    }

    Builder hasQuincho(boolean hasQuincho) {
      this.hasQuincho = hasQuincho;
      return self();
    }

    Builder inCorner(boolean inCorner) {
      this.inCorner = inCorner;
      return self();
    }

    @Override
    Builder self() {
      return this;
    }

    @Override
    House build() {
      return new House(this);
    }

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
