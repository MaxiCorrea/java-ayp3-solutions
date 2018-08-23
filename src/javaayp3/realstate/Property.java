package javaayp3.realstate;

abstract class Property implements Constants {

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

  double amountOfSalesCommission() {
    return salePrice() * commissionForSale / 100;
  }

  abstract double salePrice();

  int getCode() {
    return code;
  }

  void setCode(int code) {
    this.code = code;
  }

  String getDistrict() {
    return district;
  }

  void setDistrict(String district) {
    this.district = district;
  }

  String getHome() {
    return home;
  }

  void setHome(String home) {
    this.home = home;
  }

  int getSurface() {
    return surface;
  }

  void setSurface(int surface) {
    this.surface = surface;
  }

  int getAntiquity() {
    return antiquity;
  }

  void setAntiquity(int antiquity) {
    this.antiquity = antiquity;
  }

  State getState() {
    return state;
  }

  void setState(State state) {
    this.state = state;
  }

  int getCommissionForSale() {
    return commissionForSale;
  }

  void setCommissionForSale(int commissionForSale) {
    this.commissionForSale = commissionForSale;
  }

  abstract static class Builder<T extends Builder<T>> {

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

    T district(String district) {
      this.district = district;
      return self();
    }

    T home(String home) {
      this.home = home;
      return self();
    }

    T surface(int surface) {
      this.surface = surface;
      return self();
    }

    T antiquity(int antiquity) {
      this.antiquity = antiquity;
      return self();
    }

    T state(State state) {
      this.state = state;
      return self();
    }

    T comissionForSale(int commission) {
      this.commissionForSale = commission;
      return self();
    }

    abstract T self();

    abstract Property build();

  }

  void printAttributes() {
    System.out.println("--------- Datos de la propiedad de codigo : " + code + "----------");
    System.out.println("Barrio : " + district);
    System.out.println("Domicilio : " + home);
    System.out.println("Superficie : " + surface);
    System.out.println("Antiguedad : " + antiquity);
    System.out.println("Estado general : " + state);
    System.out.println("Comision vendedor : " + commissionForSale);
  }

}
