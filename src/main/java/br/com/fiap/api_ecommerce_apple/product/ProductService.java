package br.com.fiap.api_ecommerce_apple.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
}
