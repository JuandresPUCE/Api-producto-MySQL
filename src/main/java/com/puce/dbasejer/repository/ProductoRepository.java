package com.puce.dbasejer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puce.dbasejer.model.Producto;
//segundo el repositorio
// direrencia con interfase
// Importante extensiones
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

    List<Producto> findByNombre(String nombre);
    List<Producto> findByPrecioGreaterThan(float precio);
    
}
