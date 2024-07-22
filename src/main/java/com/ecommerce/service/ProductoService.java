package com.ecommerce.service;

import com.ecommerce.model.Producto;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    Producto save(Producto producto);
    Optional<Producto> get(Integer id);
    void update(Producto producto);
    void  delete(Integer id);
    List<Producto> findAll();
}
