package com.marcofontana.foodlymaven.repositories;

import com.marcofontana.foodlymaven.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findAllByName(String name);

}

