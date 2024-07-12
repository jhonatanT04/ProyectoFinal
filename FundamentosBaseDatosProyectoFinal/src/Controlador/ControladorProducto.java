/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOProducto;
import Modelo.Producto.Producto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorProducto {
    private DAOProducto daoProducto;

    public ControladorProducto() {
        daoProducto = new DAOProducto();
    }

    public boolean insertarProducto(Producto producto) {
        return daoProducto.insertarProducto(producto);
    }

    public Producto buscarProducto(String nombre) throws SQLException {
        return daoProducto.buscarProducto(nombre);
    }

    public boolean actualizarProducto(Producto producto) {
        return daoProducto.actualizarProducto(producto);
    }

    public boolean eliminarProducto(String nombre) {
        return daoProducto.eliminarProducto(nombre);
    }
    
    public List<Producto> listarProductos(){
        return daoProducto.listarProductos();
    }
}