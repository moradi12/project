package com.coupon.project.dataBase.Exceptions;

public class CompanyNotFoundException extends Exception {
    public CompanyNotFoundException() {
        super("Company not found!");
    }

    public CompanyNotFoundException(String message) {
        super(message);
    }
}