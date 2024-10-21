package com.design.cloudbilling.dto;

import java.util.List;

public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
    private List<SubscriptionDTO> subscriptions; // If you want to include subscriptions

    // Constructors
    public CustomerDTO() {}

    public CustomerDTO(Long id, String name, String email, List<SubscriptionDTO> subscriptions) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subscriptions = subscriptions;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<SubscriptionDTO> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<SubscriptionDTO> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
