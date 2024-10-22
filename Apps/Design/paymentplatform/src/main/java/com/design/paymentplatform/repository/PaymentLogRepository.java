package com.design.paymentplatform.repository;

import com.design.paymentplatform.model.entity.PaymentLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentLogRepository extends JpaRepository<PaymentLog, Long> {
}
