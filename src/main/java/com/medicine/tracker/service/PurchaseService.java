package com.medicine.tracker.service;

import com.medicine.tracker.model.Purchase;
import com.medicine.tracker.model.User;
import com.medicine.tracker.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public Purchase createPurchase(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    public List<Purchase> getByUser(User user) {
        return purchaseRepository.findByUser(user);
    }

    public List<Purchase> getAllPurchases() {
        return purchaseRepository.findAll();
    }
}
