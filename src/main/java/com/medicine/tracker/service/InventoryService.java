package com.medicine.tracker.service;

import com.medicine.tracker.model.Inventory;
import com.medicine.tracker.model.Medicine;
import com.medicine.tracker.model.Store;
import com.medicine.tracker.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory addInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getByStore(Store store) {
        return inventoryRepository.findByStore(store);
    }

    public List<Inventory> getByMedicine(Medicine medicine) {
        return inventoryRepository.findByMedicine(medicine);
    }

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }
}
