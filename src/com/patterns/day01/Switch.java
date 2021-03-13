/*
Retornar el sueldo de distintos empleados
  "Manager":  100000.0;
  "Developer":  70000.0;
  "intern":  35000.0;
 */
package com.patterns.day01;

public class Switch {
  public static void main(String[] args) {
    Employee emp = new Employee("Jose", "Manager");
    System.out.println(emp.getSalary(emp.getType()));

  }
}
