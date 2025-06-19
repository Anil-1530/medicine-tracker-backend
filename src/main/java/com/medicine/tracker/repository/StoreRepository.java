package com.medicine.tracker.repository;

import com.medicine.tracker.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
