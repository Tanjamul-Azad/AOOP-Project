package com.cse.project.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "credit_redemptions")
public class CreditRedemption {

    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "package_id", nullable = false)
    private SkillPackage skillPackage;

    @Column(name = "credits_spent", nullable = false)
    private Integer creditsSpent;

    @Column(name = "cash_paid")
    private BigDecimal cashPaid;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public CreditRedemption() {
    }
}
