package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.Category;

public record CategoryDTO(Long id, String name) {

    public CategoryDTO(Category entity) {
        this(entity.getId(), entity.getName());
    }
}
