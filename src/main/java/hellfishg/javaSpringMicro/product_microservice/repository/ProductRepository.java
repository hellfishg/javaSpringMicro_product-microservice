package hellfishg.javaSpringMicro.product_microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import hellfishg.javaSpringMicro.product_microservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
