package com.coupon.project.dataBase.Exceptions;

public class CouponNotFoundException extends Exception {
    public CouponNotFoundException(String message) {
        super(message);
        System.out.println("Coupon not found: " + message);
    }
}
