
package DAO;

import IDAO.newpackage.IControladorProducto;
import Modelo.Producto;
import java.util.ArrayList;



public class ProductoDAO implements IControladorProducto{
    private ArrayList<Producto> productos;

    public ProductoDAO() {
        productos = new ArrayList<Producto>();
    }

    public void insertarProducto(Producto producto) {
        productos.add(producto);
    }

    public void actualizarProducto(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == producto.getCodigo()) {
                productos.set(i, producto);
                break;
            }
        }
    }

    public void eliminarProducto(int codigo) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo) {
                productos.remove(i);
                break;
            }
        }
    }

    public Producto buscarProducto(int codigo) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo) {
                return productos.get(i);
            }
        }
        return null;
    }
}
