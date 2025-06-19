package com.medicine.tracker.repository;

import com.medicine.tracker.model.Inventory;
import com.medicine.tracker.model.Medicine;
import com.medicine.tracker.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByMedicine(Medicine medicine);
    List<Inventory> findByStore(Store store);
}

