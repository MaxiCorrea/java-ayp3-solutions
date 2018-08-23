package javaayp3.realstate.views;

import static java.util.Objects.requireNonNull;
import javaayp3.realstate.model.Department;
import javaayp3.realstate.model.House;
import javaayp3.realstate.model.Property;
import javaayp3.realstate.model.Terrain;

public class RealEstatePrinter {

  private Property property;

  public RealEstatePrinter(Property property) {
    this.property = requireNonNull(property);
  }

  public void print() {
    if (property instanceof Department) {
      new DepartmentConsolePrinter((Department) property).print();
    } else if (property instanceof House) {
      new HouseConsolePrinter((House) property).print();
    } else if (property instanceof Terrain) {
      new TerrainConsolePrinter((Terrain) property).print();
    } else {
      assert false;
    }
  }



}
