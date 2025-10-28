package br.com.saga_orquestrado.product_validation.core.repository;

import br.com.saga_orquestrado.product_validation.core.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    boolean existsByCode(String code);
}
