package com.coupon.project.dataBase.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "company")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    @Email
    @Column(nullable = false, unique = true, length = 20, name = "email")
    private String email;

    @Column(nullable = false, length = 20, name = "password")
    private String password;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Coupon> coupons;
}
