/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAO.newpackage;

import Modelo.Cliente;

/**
 *
 * @author HP
 */
public interface IControladorCliente {
   public void insertarCliente(Cliente cliente);
    public void actualizarCliente(Cliente cliente);
    public void eliminarCliente(int cedula);
    public Cliente buscarCliente(int cedula);
}
