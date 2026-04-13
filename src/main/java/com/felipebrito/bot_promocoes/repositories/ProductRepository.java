package com.felipebrito.bot_promocoes.repositories;

import com.felipebrito.bot_promocoes.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean existsByUrl(String url);
}
