package com.puce.dbasejer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puce.dbasejer.model.Producto;
//segundo el repositorio
// direrencia con interfase
// Importante extensiones
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
