package com.design.cloudbilling.repository;

import com.design.cloudbilling.model.Usage;
import com.design.cloudbilling.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsageRepository extends JpaRepository<Usage, Long> {

    List<Usage> findBySubscription(Subscription subscription);

    List<Usage> findBySubscriptionId(Long subscriptionId);

}
