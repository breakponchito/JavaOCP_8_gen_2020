package com.cert.ocp8.course.deveduardodogs.module5.practice3;

public enum Branch {

    LA("BASIC"), BOSTON("Loan"), BANGALORE("Full"), MUMBAI("Full");

    String serviceLevel;

    private Branch(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getServiceLevel(){
        return serviceLevel;
    }

}
