package javaayp3.realstate;

class Ground extends Property {

  private boolean inCorner;

  Ground(int code, String district, String home, int surface, int antiquity, int state,
      int commissionForSale, boolean inCorner) {
    super(code, district, home, surface, antiquity, state, commissionForSale);
    this.inCorner = inCorner;
  }

  boolean inCorner() {
    return inCorner;
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
