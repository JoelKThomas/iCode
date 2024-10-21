package com.design.cloudbilling.dto;

import java.time.LocalDate;

public class UsageDTO {
    private Long id;
    private double amountUsed;
    private LocalDate usageDate;

    // Constructors
    public UsageDTO() {}

    public UsageDTO(Long id, double amountUsed, LocalDate usageDate) {
        this.id = id;
        this.amountUsed = amountUsed;
        this.usageDate = usageDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(double amountUsed) {
        this.amountUsed = amountUsed;
    }

    public LocalDate getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(LocalDate usageDate) {
        this.usageDate = usageDate;
    }
}
