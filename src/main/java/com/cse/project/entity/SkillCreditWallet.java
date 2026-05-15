package com.cse.project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "skill_credit_wallets")
public class SkillCreditWallet {

    @Id
    @Column(name = "id")
    private String id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "balance", nullable = false)
    private Integer balance;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public SkillCreditWallet() {
    }
}
