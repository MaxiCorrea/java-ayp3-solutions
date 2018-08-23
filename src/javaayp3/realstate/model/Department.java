package javaayp3.realstate.model;

public class Department extends Property {

  private boolean hasGarage;
  private boolean hasStorage;

  private Department(Builder builder) {
    super(builder);
    this.hasGarage = builder.hasGarage;
    this.hasStorage = builder.hasStorage;
  }

  public boolean hasGarage() {
    return hasGarage;
  }

  public boolean hasStorage() {
    return hasStorage;
  }

  public static class Builder extends Property.Builder<Builder> {

    private boolean hasGarage;
    private boolean hasStorage;

    public Builder(int code) {
      super(code);
    }

    public Builder hasGarage(boolean hasGarage) {
      this.hasGarage = hasGarage;
      return self();
    }

    public Builder hasStorage(boolean hasStorage) {
      this.hasStorage = hasStorage;
      return self();
    }

    @Override
    Builder self() {
      return this;
    }

    @Override
    public Department build() {
      return new Department(this);
    }

  }


  @Override
  public double salePrice() {
    double coefficient = 1;
    switch (getState()) {
      case GOOD:
        coefficient = GOOD_DEPARTMENT_COEFFICIENT;
        break;
      case REGULAR:
        coefficient = REGULAR_DEPARTMENT_COEFFICIENT;
        break;
      case BAD:
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

}
