package javaayp3.realstate;

abstract class Property implements Constants {

  private int code;
  private String district;
  private String home;
  private int surface;
  private int antiquity;
  private int state; // good , regular , bad
  private int commissionForSale;

  Property(int code, String district, String home, int surface, int antiquity, int state,
      int commissionForSale) {
    this.code = code;
    this.district = district;
    this.home = home;
    this.surface = surface;
    this.antiquity = antiquity;
    this.state = state;
    this.commissionForSale = commissionForSale;
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

  int getState() {
    return state;
  }

  void setState(int state) {
    this.state = state;
  }

  int getCommissionForSale() {
    return commissionForSale;
  }

  void setCommissionForSale(int commissionForSale) {
    this.commissionForSale = commissionForSale;
  }

  void printAttributes() {
    System.out.println("--------- Datos de la propiedad de codigo : " + code + "----------");
    System.out.println("Barrio : " + district);
    System.out.println("Domicilio : " + home);
    System.out.println("Superficie : " + surface);
    System.out.println("Antiguedad : " + antiquity);
    System.out.print("Estado general : ");
    switch (state) {
      case 1:
        System.out.println("Bueno");
        break;
      case 2:
        System.out.println("Regular");
        break;
      case 3:
        System.out.println("Malo");
        break;
    }
    System.out.println("Comision vendedor : " + commissionForSale);
  }

}
