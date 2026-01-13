package com.Mxpertz.services;

import com.Mxpertz.model.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    Product updateProduct(Long id, Product updated);

    void deleteProduct(Long id);

    List<Product> getAllProducts();

    Product getProductById(Long id);
}
