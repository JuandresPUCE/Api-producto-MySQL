package com.puce.dbasejer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.puce.dbasejer.model.Producto;
import com.puce.dbasejer.services.ProductoService;

//cuarto el controlador
@RestController
//ruta api
@RequestMapping("/api/v1")
public class ProductoController {
    //inyectar el servicio
    @Autowired
    private ProductoService servicio;

    //API 
    //get listar productos
    @GetMapping ("/productos")
    public List<Producto> listarProductos(){
        return servicio.listarProductos();
    }
    //por id
    @GetMapping ("/productos/{id}")
    //path variable para obtener el id
    public Producto obtenerProductoID(@PathVariable int id){
        return servicio.obtenerProducto(id);
    } 

    //requiere un body para guardar
    @PostMapping ("/productos")
    public Producto guardarProducto(@RequestBody Producto producto){
        servicio.guardarProducto(producto);
        return producto;
    }

    //metodo borrar
    @DeleteMapping ("/productos/{id}")
    public Producto eliminarProducto(@PathVariable int id){
        servicio.eliminarProducto(id);
        return null;   
    }

    //metodo actualizar
    @PutMapping ("/productos/{id}")
    public Producto actualizarProducto(@RequestBody Producto producto, @PathVariable int id){
        servicio.guardarProducto(producto);
        Producto productoExist = servicio.obtenerProducto(id);
        return productoExist;
    }


    
}
