package com.proyecto.faan.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

public interface GenericController <T, ID extends Serializable> {
    public ResponseEntity<List<T>> findByAll();
    public ResponseEntity<?> findByAll(Pageable pageable);
    public ResponseEntity<T> findByOne(@PathVariable ID id);
    public ResponseEntity<T> save(@RequestBody T entity);
    public ResponseEntity<T> update(@PathVariable ID id, @RequestBody T entity);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
