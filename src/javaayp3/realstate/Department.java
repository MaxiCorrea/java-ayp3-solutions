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
        coefficient = goodDepartmentCoefficient;
        break;
      case 2:
        coefficient = regularDepartmentCoefficient;
        break;
      case 3:
        coefficient = badDepartmentCoefficient;
        break;
    }

    if (getAntiquity() > 10) {
      coefficient *= goodDepartmentCoefficient;
    } else if (getAntiquity() < 25) {
      coefficient *= regularDepartmentCoefficient;
    } else {
      coefficient *= badDepartmentCoefficient;
    }

    if (hasGarage) {
      coefficient *= parkingGarageCoefficient;
    }

    if (hasStorage) {
      coefficient *= coefficientDepartmentBaulera;
    }

    return getSurface() * basicValueDepartment * coefficient;
  }

  public void printAttributes() {
    super.printAttributes();
    System.out.println("Cochera : " + (hasGarage ? "Si" : "No"));
    System.out.println("Baulera : " + (hasStorage ? "Si" : "No"));
  }
  
}
