package hellfishg.javaSpringMicro.product_microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import hellfishg.javaSpringMicro.product_microservice.entity.ProductEntity;
import hellfishg.javaSpringMicro.product_microservice.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity productEntity) {
        productRepository.save(productEntity);
    }
}
