/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import IDAO.newpackage.IControladorCliente;
import Modelo.Cliente;
import Modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
class ClienteDAO implements IControladorCliente {
    private ArrayList<Cliente> clientes;

    public ClienteDAO() {
        clientes = new ArrayList<Cliente>();
    }

    public void insertarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void actualizarCliente(Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula() == cliente.getCedula()) {
                clientes.set(i, cliente);
                break;
            }
        }
    }

    public void eliminarCliente(int cedula) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula() == cedula) {
                clientes.remove(i);
                break;
            }
        }
    }

    public Cliente buscarCliente(int cedula) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula() == cedula) {
                return clientes.get(i);
            }
        }
        return null;
    }
}

