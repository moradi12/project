package com.coupon.project.dataBase.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "coupons")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "company_id", nullable = false)
    private Integer companyId;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    @Column(nullable = false)
    @Size(min = 2, max = 40)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @NotNull
    @Min(1)
    private Integer amount;

    @NotNull
    @Min(1)
    private Double price;

    private String image;

    // Define the relationship: One-to-Many with cascade option
    @OneToMany(mappedBy = "parentCoupon", cascade = CascadeType.ALL)
    private List<Coupon> childCoupons = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "parent_coupon_id")
    private Coupon parentCoupon;

    public boolean isExpired() {
        return endDate != null && endDate.isBefore(LocalDate.now());
    }
}
