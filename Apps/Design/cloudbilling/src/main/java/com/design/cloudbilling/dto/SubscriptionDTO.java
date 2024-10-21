package com.design.cloudbilling.dto;

import java.util.List;

public class SubscriptionDTO {
    private Long id;
    private String serviceName;
    private String pricingModel; // Optional, if you want to expose it
    private List<UsageDTO> usages; // If you want to include usages

    // Constructors
    public SubscriptionDTO() {}

    public SubscriptionDTO(Long id, String serviceName, String pricingModel, List<UsageDTO> usages) {
        this.id = id;
        this.serviceName = serviceName;
        this.pricingModel = pricingModel;
        this.usages = usages;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getPricingModel() {
        return pricingModel;
    }

    public void setPricingModel(String pricingModel) {
        this.pricingModel = pricingModel;
    }

    public List<UsageDTO> getUsages() {
        return usages;
    }

    public void setUsages(List<UsageDTO> usages) {
        this.usages = usages;
    }
}
