package com.cse.project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "skill_credit_ledger")
public class SkillCreditLedger {

    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "wallet_id", nullable = false)
    private SkillCreditWallet wallet;

    @Column(name = "delta", nullable = false)
    private Integer delta;

    @Column(name = "reason", nullable = false)
    private String reason;

    @Column(name = "reference_type")
    private String referenceType;

    @Column(name = "reference_id")
    private String referenceId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public SkillCreditLedger() {
    }
}
