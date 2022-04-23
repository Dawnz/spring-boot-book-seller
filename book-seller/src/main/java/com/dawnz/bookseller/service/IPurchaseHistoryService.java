package com.dawnz.bookseller.service;

import com.dawnz.bookseller.model.PurchaseHistory;
import com.dawnz.bookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
