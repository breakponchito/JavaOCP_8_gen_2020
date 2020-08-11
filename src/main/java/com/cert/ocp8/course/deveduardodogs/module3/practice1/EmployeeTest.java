package com.cert.ocp8.course.deveduardodogs.module3.practice1;


import com.cert.ocp8.course.deveduardodogs.module3.practice1.domain.Admin;
import com.cert.ocp8.course.deveduardodogs.module3.practice1.domain.Employee;
import com.cert.ocp8.course.deveduardodogs.module3.practice1.domain.Engineer;
import com.cert.ocp8.course.deveduardodogs.module3.practice1.domain.Manager;
import com.cert.ocp8.course.deveduardodogs.module3.practice1.domain.Director;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee eng = new Engineer(101, "Jane Smith" , "012-34-5678",
                120_345.27);

        Employee mgr = new Manager(207, "Barbara Johnson", "054-12-2367",
                109_501.36, "US Marketing");

        Employee adm = new Admin(304, "Bill Munroe", "108-23-6509",
                75_002.34);

        Employee dir = new Director(12, "Susan Wheeler", "099-45-2340",
                120_567.36, "Global Marketing", 1_000_000.00);

        eng.printEmployee();
        adm.printEmployee();
        mgr.printEmployee();
        dir.printEmployee();

        mgr.setName("Barbara Johnson-Smythe");
        mgr.raiseSalary(10_000.0);
        mgr.printEmployee();
    }
}
