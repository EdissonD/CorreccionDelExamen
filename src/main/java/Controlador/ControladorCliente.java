/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Vista.VistaCliente;

/**
 *
 * @author HP
 */
public class ControladorCliente {
    private ClienteDAO clienteDAO;
    private VistaCliente vistaCliente;

    // Constructor
    public ControladorCliente(ClienteDAO clienteDAO, VistaCliente vistaCliente ) {
        this.clienteDAO = clienteDAO;
        this.vistaCliente = vistaCliente;
    }

    // Métodos
    public void crearCliente() {
        Cliente cliente = vistaCliente.crearCliente();
        clienteDAO.actualizarCliente(cliente);
    }

    public void leerCliente() {
        int cedula = vistaCliente.leerCedula();
        Cliente cliente = clienteDAO.buscarCliente(cedula);
        vistaCliente.mostrarCliente(cliente);
    }

    public void actualizarCliente() {
        int cedula = vistaCliente.leerCedula();
        Cliente cliente = clienteDAO.buscarCliente(cedula);
        vistaCliente.mostrarCliente(cliente);

        cliente = vistaCliente.crearCliente();
        cliente.setCedula(cedula);
        clienteDAO.actualizarCliente(cliente);
    }

    public void eliminarCliente() {
        int cedula = vistaCliente.leerCedula();
        clienteDAO.eliminarCliente(cedula);
    }
}
