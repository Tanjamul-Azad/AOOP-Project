package com.cse.project.entity;

import jakarta.persistence.*;

@Entity(name = "skills")
public class Skill {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "icon", nullable = false)
    private String icon;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "description")
    private String description;

    public Skill() {
    }
}
