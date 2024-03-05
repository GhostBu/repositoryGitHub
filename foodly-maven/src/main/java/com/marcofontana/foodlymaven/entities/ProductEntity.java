package com.marcofontana.foodlymaven.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Date;

@Entity
@Table(name = "product", schema = "foodly")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private Date expirationDate;

    public ProductEntity(ProductEntity productEntity) {
        this.name = productEntity.getName();
        this.code = productEntity.getCode();
        this.expirationDate = productEntity.getExpirationDate();
    }

}
