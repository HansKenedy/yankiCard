package com.proyecto.yankiCard.service;

import com.proyecto.yankiCard.domain.Card;
import io.reactivex.rxjava3.core.Observable;

public interface CardService {
    Observable<?> findAll();
    Observable<Card> findByCellPhone(String cellPhone);

    Card save(Card card);
}
