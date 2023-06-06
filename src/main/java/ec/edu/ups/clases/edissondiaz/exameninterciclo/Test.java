/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.clases.edissondiaz.exameninterciclo;



import Controlador.ControladorCarrito;
import Controlador.ControladorCliente;
import Controlador.ControladorProducto;
import DAO.CarritoDAO;
import DAO.ProductoDAO;
import Vista.VistaCarrito;
import Vista.VistaCliente;
import Vista.VistaProducto;



/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        VistaCliente vistaCliente = new VistaCliente();
        ControladorCliente ControladorCliente = new ControladorCliente(clienteDAO, vistaCliente);

        ProductoDAO productoDAO = new ProductoDAO();
        VistaProducto vistaProducto = new VistaProducto();
        ControladorProducto controladorProducto = new ControladorProducto(productoDAO, vistaProducto);

        CarritoDAO carritoDAO = new CarritoDAO();
        VistaCarrito vistaCarrito = new VistaCarrito();
        ControladorCarrito controladorCarrito = new ControladorCarrito(carritoDAO, vistaCarrito, ControladorCliente, controladorProducto);

        boolean continuar = true;
        while (continuar) {
            int opcion = vistaCarrito.mostrarCarrito();
            switch (opcion) {
                case 1:
                    vistaCliente.crearCliente();
                    int opcionCliente = vistaCliente.leerCedula();
                    switch (opcionCliente) {
                        case 1:
                            ControladorCliente.crearCliente();
                            break;
                        case 2:
                            ControladorCliente.leerCliente();
                            break;
                        case 3:
                            ControladorCliente.actualizarCliente();
                            break;
                        case 4:
                            ControladorCliente.eliminarCliente();
                            break;
                    }
                    break;
                case 2:
                    vistaProducto.mostrarProducto(producto);
                    int opcionProducto = vistaProducto.leerCodigo();
                    switch (opcionProducto) {
                        case 1:
                            controladorProducto.crearProducto();
                            break;
                        case 2:
                            controladorProducto.leerProducto();
                            break;
                        case 3:
                            controladorProducto.actualizarProducto();
                            break;
                        case 4:
                            controladorProducto.eliminarProducto();
                            break;
                    }
                    break;
                case 3:
                    vistaCarrito.mostrarCarrito(carrito);
                    int opcionCarrito = vistaCarrito.mostrarCarrito(carrito);
                    switch (opcionCarrito) {
                        case 1:
                            controladorCarrito.crearCarrito();
                            break;
                        case 2:
                            controladorCarrito.crearCarrito();
                            break;
                        case 3:
                            controladorCarrito.crearCarrito();
                            break;
                        case 4:
                            controladorCarrito.crearCarrito();
                            break;
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
            }
        }
    }
}
