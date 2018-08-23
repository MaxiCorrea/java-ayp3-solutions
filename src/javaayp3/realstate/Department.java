package javaayp3.realstate;

class Department extends Property {

  private boolean hasGarage;
  private boolean hasStorage;

  Department(int code, String district, String home, int surface, int antiquity, int state,
      int commissionForSale, boolean hasGarage, boolean hasStorage) {
    super(code, district, home, surface, antiquity, state, commissionForSale);
    this.hasGarage = hasGarage;
    this.hasStorage = hasStorage;
  }

  boolean hasGarage() {
    return hasGarage;
  }

  boolean hasStorage() {
    return hasStorage;
  }

  @Override
  double salePrice() {
    double coefficient = 1;
    switch (getState()) {
      case 1:
        coefficient = GOOD_DEPARTMENT_COEFFICIENT;
        break;
      case 2:
        coefficient = REGULAR_DEPARTMENT_COEFFICIENT;
        break;
      case 3:
        coefficient = BAD_DEPARTMENT_COEFFICIENT;
        break;
    }

    if (getAntiquity() > 10) {
      coefficient *= GOOD_DEPARTMENT_COEFFICIENT;
    } else if (getAntiquity() < 25) {
      coefficient *= REGULAR_DEPARTMENT_COEFFICIENT;
    } else {
      coefficient *= BAD_DEPARTMENT_COEFFICIENT;
    }

    if (hasGarage) {
      coefficient *= PARCKING_GARAGE_COEFFICIENT;
    }

    if (hasStorage) {
      coefficient *= BAULERA_DEPARTMENT_COEFFICIENT;
    }

    return getSurface() * BASIC_VALUE_DEPARTMENT * coefficient;
  }

  public void printAttributes() {
    super.printAttributes();
    System.out.println("Cochera : " + (hasGarage ? "Si" : "No"));
    System.out.println("Baulera : " + (hasStorage ? "Si" : "No"));
  }
  
}
