/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import IDAO.newpackage.IControladorCarrito;
import Modelo.Carrito;
import java.util.ArrayList;
import java.util.Date;


public class CarritoDAO implements IControladorCarrito{
    private ArrayList<Carrito> carritos;

    public CarritoDAO() {
        carritos = new ArrayList<Carrito>();
    }

    public void insertarCarrito(Carrito carrito) {
        carritos.add(carrito);
    }

    public void actualizarCarrito(Carrito carrito) {
        for (int i = 0; i < carritos.size(); i++) {
            if (carritos.get(i).getFecha() == carrito.getFecha()) {
                carritos.set(i, carrito);
                break;
            }
        }
    }

    public void eliminarCarrito(Date fecha) {
        for (int i = 0; i < carritos.size(); i++) {
            if (carritos.get(i).getFecha() == fecha) {
                carritos.remove(i);
                break;
            }
        }
    }

    public Carrito buscarCarrito(Date fecha) {
        for (int i = 0; i < carritos.size(); i++) {
            if (carritos.get(i).getFecha() == fecha) {
                return carritos.get(i);
            }
        }
        return null;
    }
}
