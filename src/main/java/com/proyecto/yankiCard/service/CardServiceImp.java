package com.proyecto.yankiCard.service;

import com.proyecto.yankiCard.domain.Card;
import com.proyecto.yankiCard.repository.CardRepository;
import io.reactivex.rxjava3.core.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImp implements CardService {
    @Autowired
    private CardRepository cardRepository;
    @Override
    public Observable<Card> findAll() {
        return Observable.fromIterable(cardRepository.findAll()) ;
    }
    @Override
    public Observable<Card> findByCellPhone(String cellPhone) {
        return Observable.fromIterable(cardRepository.findAll()).filter(card -> card.getCellPhone().equals(cellPhone));
    }

    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }

}
