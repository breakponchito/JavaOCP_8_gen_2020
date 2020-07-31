package com.cert.ocp8.course.deveduardodogs.module4.practice1;

import com.cert.ocp8.course.deveduardodogs.module4.practice1.business.EmployeeStockPlan;
import com.cert.ocp8.course.deveduardodogs.module4.practice1.domain.*;

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


        mgr.setName("Barbara Johnson-Smythe");
        mgr.raiseSalary(10_000.0);

        EmployeeStockPlan esp = new EmployeeStockPlan();
        printEmployee(eng,esp);
        printEmployee(mgr,esp);
        printEmployee(adm,esp);
        printEmployee(dir,esp);

    }

    public static void printEmployee(Employee emp){
        System.out.println(emp);
    }

    public static void printEmployee(Employee emp, EmployeeStockPlan esp){
        printEmployee(emp);
        System.out.println("Stock Options      : " +
                esp.grantStock(emp));
    }

}
