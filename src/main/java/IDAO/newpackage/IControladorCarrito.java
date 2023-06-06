/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAO.newpackage;

import Modelo.Carrito;
import java.util.Date;

/**
 *
 * @author HP
 */
public interface IControladorCarrito {
    public void insertarCarrito(Carrito carrito);
    public void actualizarCarrito(Carrito carrito);
    public void eliminarCarrito(Date fecha);
    public Carrito buscarCarrito(Date fecha);
}
