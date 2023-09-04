package com.proyecto.yankiCard.controller;

import com.proyecto.yankiCard.domain.Card;
import com.proyecto.yankiCard.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.List;

@RestController
@RequestMapping("/v1/card")
public class CardController {
    @Autowired
    private CardService cardService;

    @GetMapping
    public DeferredResult<ResponseEntity<List<?>>> findAll() {
        DeferredResult<ResponseEntity<List<?>>> deferredResult = new DeferredResult<>();
        cardService.findAll().toList()
                .subscribe(cardView -> deferredResult.setResult(ResponseEntity.accepted().body(cardView)), deferredResult::setErrorResult);
        return deferredResult;
    }

    @GetMapping("/{cellPhone}")
    public DeferredResult<ResponseEntity<List<?>>> findById(@PathVariable String cellPhone) {
        DeferredResult<ResponseEntity<List<?>>> deferredResult = new DeferredResult<>();
        cardService.findByCellPhone(cellPhone).toList()
                .subscribe(cardView -> deferredResult.setResult(ResponseEntity.accepted().body(cardView)), deferredResult::setErrorResult);
        return deferredResult;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Card card) {
        Card savedCard = cardService.save(card);
        return ResponseEntity.ok().body(savedCard);
    }

}
