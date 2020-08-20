package com.cert.ocp8.course.deveduardodogs.module5.practice2;

public class Employee {

    class BenefitsHelper {
        private final double bonusRate = 0.02;
        private final double withHoldingRate = 0.07;

        protected double calcBonus(double salary){
            return salary * bonusRate;
        }

        protected double calcWithHoldingRate(double salary){
            return salary * withHoldingRate;
        }
    }

    private String name;
    private String role;
    private String dept;
    private double salary;
    private BenefitsHelper helper = new BenefitsHelper();

    public Employee() {
        super();
    }

    public Employee(String name, String role, String dept, double salary) {
        this.name = name;
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public double getWithholding(){
        return helper.calcWithHoldingRate(salary);
    }

    public double getBonus(){
        return helper.calcBonus(salary);
    }

}


