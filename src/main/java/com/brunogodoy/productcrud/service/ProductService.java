package com.brunogodoy.productcrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brunogodoy.productcrud.exceptions.ResourceNotFound;
import com.brunogodoy.productcrud.model.Product;
import com.brunogodoy.productcrud.repository.ProductRepository;

@Service
public class ProductService {

  public final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Product findById(Long id) {
    return productRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFound("Produto com o ID " + id + " não encontrado!"));
  }

  public Product save(Product product) {
    return productRepository.save(product);
  }

  public void deleteById(Long id) {

    if (!productRepository.existsById(id)) {
      throw new ResourceNotFound(("Produto com o ID " + id + " não encontrado!"));
    }
    productRepository.deleteById(id);
  }

}
