package com.coupon.project.Controllers;

import com.coupon.project.dataBase.Exceptions.CouponNotFoundException;
import com.coupon.project.dataBase.Service.CouponService;
import com.coupon.project.dataBase.beans.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("project/coupon/v2/spring/coupon/api/coupon")
public class CouponController {
    @Autowired
    CouponService couponService;

    @GetMapping
    public List<Coupon> getAllCoupons() {
        return couponService.getAllCoupons();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCoupon(@Validated @RequestBody Coupon coupon) {
        couponService.addCoupon(coupon);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCoupon(@PathVariable int id, @RequestBody Coupon coupon) throws CouponNotFoundException {
        couponService.updateCoupon(id, coupon);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCoupon(@PathVariable int id) throws CouponNotFoundException {
        couponService.deleteCoupon(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Coupon getSingleCoupon(@PathVariable int id) throws CouponNotFoundException {
        return couponService.getOneCoupon(id);
    }
}