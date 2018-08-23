package javaayp3.realstate;

import javaayp3.realstate.model.Property;
import javaayp3.realstate.views.RealEstatePrinter;

public class RealEstate {
  
  public void comparePricesAndPrint(Property property1, Property property2) {
    if (property1.salePrice() > property2.salePrice()) {
      new RealEstatePrinter(property1).print();
    } else {
      new RealEstatePrinter(property2).print();
    }
  }
    
}
