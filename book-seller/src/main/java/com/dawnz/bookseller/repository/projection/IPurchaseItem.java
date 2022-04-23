package com.dawnz.bookseller.repository.projection;

import java.time.LocalDateTime;
//this interface only has getters for the items we need when we locate the userId
//we want to populate this
public interface IPurchaseItem {
    String getTitle();
    String getPrice();
    LocalDateTime getPurchaseTime();
}
