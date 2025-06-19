package com.medicine.tracker.repository;

import com.medicine.tracker.model.Purchase;
import com.medicine.tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    List<Purchase> findByUser(User user);
}

