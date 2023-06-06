/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAO.newpackage;

import Modelo.Producto;


public interface IControladorProducto {
    public void insertarProducto(Producto producto);
    public void actualizarProducto(Producto producto);
    public void eliminarProducto(int codigo);
    public Producto buscarProducto(int codigo);
}
