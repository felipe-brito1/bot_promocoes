package com.felipebrito.bot_promocoes.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal originalPrice;
    private BigDecimal finalPrice;

    private String url;
    @Enumerated(EnumType.STRING)
    private Store store;

    private Boolean sent;
}
