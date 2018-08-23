package javaayp3.realstate.views;

import static java.util.Objects.requireNonNull;
import javaayp3.realstate.model.Property;

abstract class PropertyConsolePrinter {

  private final Property property;

  PropertyConsolePrinter(Property property) {
    this.property = requireNonNull(property);
  }

  void print() {
    System.out.println(
        "--------- Datos de la propiedad de codigo : " + property.getCode() + "----------");
    System.out.println("Barrio : " + property.getDistrict());
    System.out.println("Domicilio : " + property.getHome());
    System.out.println("Superficie : " + property.getSurface());
    System.out.println("Antiguedad : " + property.getAntiquity());
    System.out.println("Estado general : " + property.getState());
    System.out.println("Comision vendedor : " + property.getCommissionForSale());
  }

}
