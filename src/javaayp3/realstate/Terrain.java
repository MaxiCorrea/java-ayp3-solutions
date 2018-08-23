package javaayp3.realstate;

class Terrain extends Property {

  private boolean inCorner;

  private Terrain(Builder builder) {
    super(builder);
    this.inCorner = builder.inCorner;
  }
  
  boolean inCorner() {
    return inCorner;
  }

  static class Builder extends Property.Builder<Builder> {

    private boolean inCorner;
    
    public Builder(int code) {
      super(code);
    }

    Builder inCorner( boolean inCorner) {
      this.inCorner = inCorner;
      return self();
    }
    
    @Override
    Builder self() {
      return this;
    }

    @Override
    Terrain build() {
      return new Terrain(this);
    }
    
  }
  
  
  @Override
  double salePrice() {
    double coefficient = 1;
    switch (getState()) {
      case 1:
        coefficient = GOOD_TERRAIN_COEFFICIENT;
        break;
      case 2:
        coefficient = REGULAR_TERRAIN_COEFFICIENT;
        break;
      case 3:
        coefficient = BAD_TERRAIN_COEFFICIENT;
        break;
    }

    if (inCorner()) {
      coefficient *= GROUND_TERRAIN_COEFFICIENT;
    }

    return getSurface() * BASIC_VALUE_BALDIO_LAND * coefficient;
  }

  @Override
  void printAttributes() {
    super.printAttributes();
    System.out.println("En esquina : " + (inCorner() ? "Si" : "No"));
  }

}
