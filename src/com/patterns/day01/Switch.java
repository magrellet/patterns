/*
Retornar el sueldo de distintos empleados
  "Manager":  100000.0;
  "Developer":  70000.0;
  "intern":  35000.0;
 */
package com.patterns.day01;

import com.patterns.day01.employees.Developer;
import com.patterns.day01.employees.Intern;
import com.patterns.day01.employees.Manager;

import java.util.ArrayList;
import java.util.List;

public class Switch {
  public static void main(String[] args) {
    Employee emp = new Employee("Jose", "Manager");
    //System.out.println(emp.getSalary(emp.getType()));

    //better approach instead of have a switch
    //Polimorfism: Can be Object (all extends object), can be employee or can be itself
    com.patterns.day01.employees.Employee intern = new Intern("pepe", 5); //polimorfism: Know who im calling
    com.patterns.day01.employees.Employee manager = new Manager("jefecito");
    com.patterns.day01.employees.Employee developer = new Developer("ñoño");

    List<com.patterns.day01.employees.Employee> empList = new ArrayList<>();
    empList.add(intern);
    empList.add(manager);
    empList.add(developer);

    empList.forEach(employee -> System.out.println(employee.getName() + " : " + employee.getSalary()));

  }
}
