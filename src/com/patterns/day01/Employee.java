package com.patterns.day01;

public class Employee {
  private String name;
  private String type;

  Employee(String name, String type){
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  Double getSalary(String type){
    switch (type){
      case "Manager": return 100000.0;
      case "Developer": return 70000.0;
      case "intern": return 35000.0;
      default: return 0.0;
    }
  }
}