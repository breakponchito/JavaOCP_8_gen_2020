package com.cert.ocp8.course.deveduardodogs.module4.practice1.business;

import com.cert.ocp8.course.deveduardodogs.module4.practice1.domain.Director;
import com.cert.ocp8.course.deveduardodogs.module4.practice1.domain.Employee;
import com.cert.ocp8.course.deveduardodogs.module4.practice1.domain.Manager;

public class EmployeeStockPlan {

    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;

    public int grantStock (Employee emp) {

        if (emp instanceof Director) {
            return directorShares;
        } else {
            if (emp instanceof Manager) {
                return managerShares;
            } else {
                return employeeShares;
            }
        }
    }

}
