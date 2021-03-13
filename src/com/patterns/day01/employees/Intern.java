package com.patterns.day01.employees;

public class Intern extends Developer {
    private int extraHours;

    public Intern(String name) {
        super(name);
    }

    public Intern(String name, int extraHours) {
        super(name);
        this.extraHours = extraHours;
    }

    @Override
    public double getSalary() {
        return (super.getSalary() / 2) + (extraHours * 100);
    }
}
