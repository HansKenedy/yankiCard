package com.proyecto.yankiCard.domain;

import lombok.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@ToString
@EqualsAndHashCode(of = {"cardNumber"})
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "card")
public class Card {
    @Id
    private String id;

    @NotNull
    @Indexed(unique = true)
    private String cardNumber;

    @Indexed(unique = true)
    private String cellPhone;

    private Double amount;
}
