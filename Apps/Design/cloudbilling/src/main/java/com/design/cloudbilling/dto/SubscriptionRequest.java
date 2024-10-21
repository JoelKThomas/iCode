package com.design.cloudbilling.dto;

public class SubscriptionRequest {

    private String servicePlanId; // The ID or name of the service plan
    private String pricingModel; // Pay-as-you-go, Reserved, Savings Plan

    // Getters and Setters
    public String getServicePlanId() {
        return servicePlanId;
    }

    public void setServicePlanId(String servicePlanId) {
        this.servicePlanId = servicePlanId;
    }

    public String getPricingModel() {
        return pricingModel;
    }

    public void setPricingModel(String pricingModel) {
        this.pricingModel = pricingModel;
    }
}
