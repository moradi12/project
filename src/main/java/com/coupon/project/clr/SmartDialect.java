package com.coupon.project.clr;

import com.coupon.project.dataBase.Repository.CouponRepository;
import com.coupon.project.dataBase.beans.Coupon;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

public class SmartDialect implements CommandLineRunner {

    CouponRepository couponRepository;


    @Override
    public void run(String... args) throws Exception {

        ////coupon repo test!!!!!!!!!!!////////

        List<Coupon> findByPriceLessThan = couponRepository.findByPriceLessThan(100.00);
        List<Coupon> couponStartWith = couponRepository.findByNameStartingWith("PC");
        List<Coupon> findByCompanyId = couponRepository.findByCompanyId(3);
        List<Coupon> findByNameOrId = couponRepository.findByNameOrId("Hotel", 4);




    }
}
