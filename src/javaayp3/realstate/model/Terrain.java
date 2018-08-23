package javaayp3.realstate.model;

public class Terrain extends Property {

  private boolean inCorner;

  private Terrain(Builder builder) {
    super(builder);
    this.inCorner = builder.inCorner;
  }

  public boolean inCorner() {
    return inCorner;
  }

  public static class Builder extends Property.Builder<Builder> {

    private boolean inCorner;

    public Builder(int code) {
      super(code);
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
    public Terrain build() {
      return new Terrain(this);
    }

  }


  @Override
  public double salePrice() {
    double coefficient = 1;
    switch (getState()) {
      case GOOD:
        coefficient = GOOD_TERRAIN_COEFFICIENT;
        break;
      case REGULAR:
        coefficient = REGULAR_TERRAIN_COEFFICIENT;
        break;
      case BAD:
        coefficient = BAD_TERRAIN_COEFFICIENT;
        break;
    }

    if (inCorner()) {
      coefficient *= GROUND_TERRAIN_COEFFICIENT;
    }

    return getSurface() * BASIC_VALUE_BALDIO_LAND * coefficient;
  }

}
