/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class VistaProducto {
    private Scanner scanner;

    // Constructor
    public VistaProducto() {
        this.scanner = new Scanner(System.in);
    }

    // Métodos
    public Producto crearProducto() {
        System.out.print("Ingrese el código del producto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la descripción del producto: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        return new Producto(codigo, nombre, descripcion, precio);
    }

    public int leerCodigo() {
        System.out.print("Ingrese el código del producto: ");
        return scanner.nextInt();
    }

    public void mostrarProducto(Producto producto) {
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Precio: " + producto.getPrecio());
    }
}
