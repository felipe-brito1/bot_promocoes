package com.felipebrito.bot_promocoes.services;


import com.felipebrito.bot_promocoes.entities.Product;
import com.felipebrito.bot_promocoes.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void saveIfNew(Product product){
        if(!productRepository.existsByUrl(product.getUrl())){
            product.setSent(false);
            productRepository.save(product);
        }
    }
    public List<Product> findUnsent(){
        return productRepository.findBySentFalse();
    }
    public void markAsSent(Product product){
        product.setSent(true);
        productRepository.save(product);
    }

}
