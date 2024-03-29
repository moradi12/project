package com.coupon.project.dataBase.Service;

import com.coupon.project.dataBase.beans.Coupon;

import java.util.ArrayList;

public interface CouponService {
    void addCoupon(Coupon coupon);

    void updateCoupon(int id, Coupon coupon);

    void deleteCoupon(int couponID);

    void addCouponPurchase(int customerID, int couponID);

    void deleteCouponPurchase(int customerID, int couponID);


    ArrayList<Coupon> getAllCoupons();

    Coupon getOneCoupon(int couponID);
}
