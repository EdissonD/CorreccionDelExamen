/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.CarritoDAO;
import Modelo.Carrito;
import Modelo.Cliente;
import Modelo.Producto;
import Vista.VistaCarrito;
import java.util.List;


/**
 *
 * @author HP
 */
public class ControladorCarrito {
    private CarritoDAO carritoDAO;
    private VistaCarrito vistaCarrito;
    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;

    // Constructor

    public ControladorCarrito(CarritoDAO carritoDAO, VistaCarrito vistaCarrito, ControladorCliente controladorCliente, ControladorProducto controladorProducto) {
        this.carritoDAO = carritoDAO;
        this.vistaCarrito = vistaCarrito;
        this.controladorCliente = controladorCliente;
        this.controladorProducto = controladorProducto;
    }
    

    // Métodos
    public void crearCarrito() {
        Cliente cliente = controladorCliente.leerCliente();
        Carrito carrito = vistaCarrito.crearCarrito(cliente);
        boolean continuar = true;
        while (continuar) {
            int opcion = vistaCarrito.mostrarCarrito(carrito);
            switch (opcion) {
                case 1:
                    Producto producto = controladorProducto.leerProducto();
                    carrito.getProductos().add(producto);
                    break;
                case 2:
                    int codigo = vistaCarrito.mostrarCarrito(carrito);
                    List<Producto> productos = carrito.getProductos();
                    for (int i = 0; i < productos.size(); i++) {
                        if (productos.get(i).getCodigo() == codigo) {
                            productos.remove(i);
                            break;
                        }
                    }
                    break;
                case 3:
                    vistaCarrito.mostrarCarrito((Carrito) carrito.getProductos());
                    break;
                case 4:
                    continuar = false;
                    break;
            }
        }
        carritoDAO.actualizarCarrito(carrito);
    }
}
