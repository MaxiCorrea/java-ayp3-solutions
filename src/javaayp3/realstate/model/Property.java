package javaayp3.realstate.model;

import javaayp3.realstate.Constants;

public abstract class Property implements Constants {

  private int code;
  private String district;
  private String home;
  private int surface;
  private int antiquity;
  private State state;
  private int commissionForSale;

  Property(Builder<?> builder) {
    this.code = builder.code;
    this.district = builder.district;
    this.home = builder.home;
    this.surface = builder.surface;
    this.antiquity = builder.antiquity;
    this.state = builder.state;
    this.commissionForSale = builder.commissionForSale;
  }

  public double amountOfSalesCommission() {
    return salePrice() * commissionForSale / 100;
  }

  public abstract double salePrice();

  public int getCode() {
    return code;
  }

  public String getDistrict() {
    return district;
  }

  public String getHome() {
    return home;
  }

  public int getSurface() {
    return surface;
  }

  public int getAntiquity() {
    return antiquity;
  }

  public State getState() {
    return state;
  }

  public int getCommissionForSale() {
    return commissionForSale;
  }

  public abstract static class Builder<T extends Builder<T>> {

    private final int code;
    private String district;
    private String home;
    private int surface;
    private int antiquity;
    private State state;
    private int commissionForSale;

    public Builder(int code) {
      this.code = code;
    }

    public T district(String district) {
      this.district = district;
      return self();
    }

    public T home(String home) {
      this.home = home;
      return self();
    }

    public T surface(int surface) {
      this.surface = surface;
      return self();
    }

    public T antiquity(int antiquity) {
      this.antiquity = antiquity;
      return self();
    }

    public T state(State state) {
      this.state = state;
      return self();
    }

    public T comissionForSale(int commission) {
      this.commissionForSale = commission;
      return self();
    }

    abstract T self();

    abstract Property build();

  }

}
