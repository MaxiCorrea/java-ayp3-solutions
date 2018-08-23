package javaayp3.realstate.views;

import javaayp3.realstate.model.Department;

class DepartmentConsolePrinter extends PropertyConsolePrinter {

  private Department department;

  DepartmentConsolePrinter(Department department) {
    super(department);
    this.department = department;
  }

  @Override
  void print() {
    super.print();
    System.out.println("Cochera : " + (department.hasGarage() ? "Si" : "No"));
    System.out.println("Baulera : " + (department.hasStorage() ? "Si" : "No"));
  }

}
