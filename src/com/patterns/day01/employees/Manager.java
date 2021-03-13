package com.patterns.day01.employees;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return 35000.0;
    }

}
