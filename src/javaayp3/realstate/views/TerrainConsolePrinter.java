package javaayp3.realstate.views;

import javaayp3.realstate.model.Terrain;

class TerrainConsolePrinter extends PropertyConsolePrinter {

  private Terrain terrain;
  
  public TerrainConsolePrinter(Terrain terrain) {
    super(terrain);
    this.terrain = terrain;
  }

  @Override
  public void print() {
    super.print();
    System.out.println("En esquina : " + (terrain.inCorner() ? "Si" : "No"));
  }
  
  
}
