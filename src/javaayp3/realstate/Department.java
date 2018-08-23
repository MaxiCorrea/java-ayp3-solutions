package javaayp3.realstate;

class Department extends Property {

  private boolean hasGarage;
  private boolean hasStorage;

  private Department(Builder builder) {
    super(builder);
    this.hasGarage = builder.hasGarage;
    this.hasStorage = builder.hasStorage;
  }

  boolean hasGarage() {
    return hasGarage;
  }

  boolean hasStorage() {
    return hasStorage;
  }

  static class Builder extends Property.Builder<Builder> {

    private boolean hasGarage;
    private boolean hasStorage;

    public Builder(int code) {
      super(code);
    }

    Builder hasGarage(boolean hasGarage) {
      this.hasGarage = hasGarage;
      return self();
    }

    Builder hasStorage(boolean hasStorage) {
      this.hasStorage = hasStorage;
      return self();
    }

    @Override
    Builder self() {
      return this;
    }

    @Override
    Department build() {
      return new Department(this);
    }

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
