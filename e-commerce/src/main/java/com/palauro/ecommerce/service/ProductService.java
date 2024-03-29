package com.palauro.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.palauro.ecommerce.model.Product;
import com.palauro.ecommerce.repository.ProductRepository;


@Service
public class ProductService {
    
    @Autowired
    ProductRepository productRepository;


    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public void removeProductById(long id){
        productRepository.deleteById(id);
    }

    public Optional<Product> getProductById(long id){
        return productRepository.findById(id);
    }

    public List<Product> getAllProductsByCategoryId(int id){
        return productRepository.findAllByCategory_Id(id); //Este trecho de código chama o método findAllByCategory_Id() do ProductRepository, que foi definido anteriormente. Este método é fornecido pelo Spring Data JPA e é usado para buscar todos os produtos associados a uma determinada categoria com base no ID da categoria fornecido.
    }



}
