package com.cert.ocp8.course.deveduardodogs.module6.practice2;

public abstract class Account {
    
    protected double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Current balance is " + balance;
    }

}
