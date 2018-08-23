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
        coefficient = Good_terrain_coefficient;
        break;
      case 2:
        coefficient = regular_terrain_coefficient;
        break;
      case 3:
        coefficient = bad_terrain_coefficient;
        break;
    }

    if (inCorner()) {
      coefficient *= Ground_terrain_coefficient;
    }

    return getSurface() * basicValueBaldioLand * coefficient;
  }

  @Override
  void printAttributes() {
    super.printAttributes();
    System.out.println("En esquina : " + (inCorner() ? "Si" : "No"));
  }

}
