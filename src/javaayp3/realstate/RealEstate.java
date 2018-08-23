package javaayp3.realstate;

class RealEstate {

  void comparePricesAndPrint(Property property1, Property property2) {
    if (property1.salePrice() > property2.salePrice()) {
      property1.printAttributes();
    } else {
      property2.printAttributes();
    }
  }
  
}
