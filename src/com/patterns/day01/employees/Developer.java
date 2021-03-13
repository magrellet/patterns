package com.patterns.day01.employees;

public class Developer extends Employee{

    public Developer(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return 70000.0;
    }
}
