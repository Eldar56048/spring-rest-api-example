package com.amigoscode.amigoscode.service.base;

import java.util.List;

public interface BaseService<T> {
    List<T> getAll();
    T getById(Long id);
    T save(T model);
    boolean existsById(Long id);
    void deleteById(Long id);
}
