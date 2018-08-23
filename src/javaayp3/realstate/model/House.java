package javaayp3.realstate.model;

public class House extends Property {

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

  public int getSurfaceTerrain() {
    return surfaceTerrain;
  }

  public boolean hasGarage() {
    return hasGarage;
  }

  public boolean hasPool() {
    return hasPool;
  }

  public boolean hasQuincho() {
    return hasQuincho;
  }

  public boolean inCorner() {
    return inCorner;
  }

  public static class Builder extends Property.Builder<Builder> {

    private int surfaceTerrain;
    private boolean hasGarage;
    private boolean hasPool;
    private boolean hasQuincho;
    private boolean inCorner;

    public Builder(int code) {
      super(code);
    }

    public Builder surfaceTerrain(int surfaceTerrain) {
      this.surfaceTerrain = surfaceTerrain;
      return self();
    }

    public Builder hasGarage(boolean hasGarage) {
      this.hasGarage = hasGarage;
      return self();
    }

    public Builder hasPool(boolean hasPool) {
      this.hasPool = hasPool;
      return self();
    }

    public Builder hasQuincho(boolean hasQuincho) {
      this.hasQuincho = hasQuincho;
      return self();
    }

    public Builder inCorner(boolean inCorner) {
      this.inCorner = inCorner;
      return self();
    }

    @Override
    Builder self() {
      return this;
    }

    @Override
    public House build() {
      return new House(this);
    }

  }


  @Override
  public double salePrice() {
    double coefficientHouse = 1;
    double coefficientTerrain = 1;
    switch (getState()) {
      case GOOD:
        coefficientHouse = GOOD_HOUSE_COEFFICIENT;
        break;
      case REGULAR:
        coefficientHouse = REGULAR_HOUSE_COEFFICIENT;
        break;
      case BAD:
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

}
