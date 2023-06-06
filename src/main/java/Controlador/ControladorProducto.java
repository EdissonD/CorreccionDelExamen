/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.ProductoDAO;
import Modelo.Producto;
import Vista.VistaProducto;

/**
 *
 * @author HP
 */
public class ControladorProducto {
    private ProductoDAO productoDAO;
    private VistaProducto vistaProducto;

    // Constructor
    public ControladorProducto(ProductoDAO productoDAO, VistaProducto vistaProducto ) {
        this.productoDAO = productoDAO;
        this.vistaProducto = vistaProducto;
    }

    // Métodos
    public void crearProducto() {
        Producto producto = vistaProducto.crearProducto();
        productoDAO.actualizarProducto(producto);
    }

    public void leerProducto() {
        int codigo = vistaProducto.leerCodigo();
        Producto producto = productoDAO.buscarProducto(codigo);
        vistaProducto.mostrarProducto(producto);
    }

    public void actualizarProducto() {
        int codigo = vistaProducto.leerCodigo();
        Producto producto = productoDAO.buscarProducto(codigo);
        vistaProducto.mostrarProducto(producto);

        producto = vistaProducto.crearProducto();
        producto.setCodigo(codigo);
        productoDAO.actualizarProducto(producto);
    }

    public void eliminarProducto() {
        int codigo = vistaProducto.leerCodigo();
        productoDAO.eliminarProducto(codigo);
    }
}
