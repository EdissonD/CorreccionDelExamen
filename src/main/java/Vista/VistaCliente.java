
package Vista;

import Modelo.Cliente;
import java.util.Scanner;

public class VistaCliente {
    private Scanner scanner;

    // Constructor
    public VistaCliente() {
        this.scanner = new Scanner(System.in);
    }

    // Métodos
    public Cliente crearCliente() {
        System.out.print("Ingrese la cédula del cliente: ");
        int cedula = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese los nombres del cliente: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese los apellidos del cliente: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el teléfono del cliente: ");
        String telefono = scanner.nextLine();

        return new Cliente(cedula, nombres, apellidos, direccion, telefono);
    }

    public int leerCedula() {
        System.out.print("Ingrese la cédula del cliente: ");
        return scanner.nextInt();
    }

    public void mostrarCliente(Cliente cliente) {
        System.out.println("Cédula: " + cliente.getCedula());
        System.out.println("Nombres: " + cliente.getNombres());
        System.out.println("Apellidos: " + cliente.getApellidos());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Teléfono: " + cliente.getTelefono());
    }
}
