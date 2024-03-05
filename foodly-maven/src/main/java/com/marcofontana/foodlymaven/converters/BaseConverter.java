package com.marcofontana.foodlymaven.converters;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BaseConverter {
    private final ModelMapper modelMapper = new ModelMapper();

    public BaseConverter() {
    }

    public <DTO, Entity> DTO convertToDto(Entity entity, Class<DTO> dtoClass) {
        return modelMapper.map(entity, dtoClass);
    }

    public <DTO, Entity> Entity convertToEntity(DTO dto, Class<Entity> entityClass) {
        return modelMapper.map(dto, entityClass);
    }

    public <DTO, Entity> List<DTO> convertListToDto(List<Entity> entityList, Class<DTO> dtoClass) {
        List<DTO> dtoList = new ArrayList<>();
        for (Entity entity : entityList) {
            dtoList.add(convertToDto(entity, dtoClass));
        }
        return dtoList;
    }

    public <DTO, Entity> List<Entity> convertListToEntity(List<DTO> dtoList, Class<Entity> entityClass) {
        List<Entity> entityList = new ArrayList<>();
        for (DTO dto : dtoList) {
            entityList.add(convertToEntity(dto, entityClass));
        }
        return entityList;
    }
}
