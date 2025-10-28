package br.com.saga_orquestrado.product_validation.core.repository;

import br.com.saga_orquestrado.product_validation.core.model.Validation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ValidationRepository extends JpaRepository<Validation, Integer> {

    boolean existsByOrderIdAndTransactionId(String orderId, String transactionId);
    Optional<Validation> findByOrderIdAndTransactionId(String orderId, String transactionId);
}
