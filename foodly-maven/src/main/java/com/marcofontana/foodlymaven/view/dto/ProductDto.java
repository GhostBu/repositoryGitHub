package com.marcofontana.foodlymaven.view.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.marcofontana.foodlymaven.configurations.CustomDateDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private String name;
    private String code;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date expirationDate;

}
