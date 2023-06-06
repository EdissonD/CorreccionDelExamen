/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Carrito;
import Modelo.Cliente;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class VistaCarrito {
    private Scanner scanner;

    // Constructor
    public VistaCarrito() {
        this.scanner = new Scanner(System.in);
    }

    // Métodos
    public Carrito crearCarrito(Cliente cliente) {
        Date fecha = new Date();
        double subtotal = 0;
        double iva = 0;
        double total = 0;
        List<Producto> productos = null;

        return new Carrito(fecha, subtotal, iva, total, cliente, (ArrayList<Producto>) productos);
    }

    public void mostrarCarrito(Carrito carrito) {
        System.out.println("Fecha: " + carrito.getFecha());
        System.out.println("Subtotal: " + carrito.getSubtotal());
        System.out.println("IVA: " + carrito.getIva());
        System.out.println("Total: " + carrito.getTotal());
        System.out.println("Cliente: " + carrito.getCliente().getNombres() + " " + carrito.getCliente().getApellidos());
        System.out.println("Productos: ");
        for (Producto producto : carrito.getProductos()) {
            System.out.println("- " + producto.getNombre() + " (" + producto.getPrecio() + ")");
        }
    }
}
