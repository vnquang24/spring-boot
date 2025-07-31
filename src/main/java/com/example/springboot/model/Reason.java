package com.example.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reasons")
public class Reason {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "reason_type", columnDefinition = "varchar(10)", nullable = false)
    private ReasonType reasonType;

    @Column(name = "description", length = 255, nullable = false)
    private String description;

    @Column(name = "required_detail", columnDefinition = "boolean default false")
    private Boolean requiredDetail = false;

    @Column(name = "is_active", columnDefinition = "boolean default true")
    private Boolean isActive = true;

    public enum ReasonType {
        CANCEL, REJECT
    }

    // Constructors
    public Reason() {}

    public Reason(ReasonType reasonType, String description, Boolean requiredDetail) {
        this.reasonType = reasonType;
        this.description = description;
        this.requiredDetail = requiredDetail;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReasonType getReasonType() {
        return reasonType;
    }

    public void setReasonType(ReasonType reasonType) {
        this.reasonType = reasonType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRequiredDetail() {
        return requiredDetail;
    }

    public void setRequiredDetail(Boolean requiredDetail) {
        this.requiredDetail = requiredDetail;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
} 