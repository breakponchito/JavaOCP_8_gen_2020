package com.cert.ocp8.course.deveduardodogs.module4.practice2.domain;

public class Engineer extends Employee {
   

    public Engineer(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }
    public void engineerMethod(){
           System.out.println("Method specific to Engineer class");
    }
}