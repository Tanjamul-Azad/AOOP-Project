package com.cse.project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "skill_embeddings")
public class SkillEmbedding {

    @Id
    @Column(name = "skill_id")
    private String skillId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "model_name", nullable = false)
    private String modelName;

    @Column(name = "dimensions", nullable = false)
    private Integer dimensions;

    @Column(name = "vector_json", nullable = false, columnDefinition = "LONGTEXT")
    private String vectorJson;

    @Column(name = "source_text", nullable = false)
    private String sourceText;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public SkillEmbedding() {
    }
}
