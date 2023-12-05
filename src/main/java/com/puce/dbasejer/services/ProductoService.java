package com.puce.dbasejer.services;

//import org.hibernate.mapping.List; //causa conflicto usar javautil
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import java.util.*;
import com.puce.dbasejer.model.Producto;
import com.puce.dbasejer.repository.ProductoRepository;

//tercerto
@Service
public class ProductoService {
    //necesito inyectar el repositorio

    @Autowired
    private ProductoRepository repositorio;

    //metodos
    //para listar los productos de la DB
    public List<Producto> listarProductos(){
        //findall lista prodctos
        return repositorio.findAll();
    }

    //para guardar un producto insert -> save
    public void guardarProducto(Producto producto){
        repositorio.save(producto);
    }
    //producto por id obtener/select-> findbyid
    public Producto obtenerProducto(int id){
        return repositorio.findById(id).get();
    }

    //eliminar producto delete -> deletebyid
    public void eliminarProducto(int id){
        repositorio.deleteById(id);
    }

    
}
