package tiendaProds;

import java.util.ArrayList;

public class SistemaTienda {
    private ArrayList<Producto> productos = new ArrayList<>();

    public SistemaTienda(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void borrarProducto(Producto producto){
        productos.remove(producto);
    }

    public void modificarProducto(Producto productoViejo, Producto productoNuevo){
        productos.remove(productoViejo);
        productos.add(productoNuevo);
    }

    public void mostrarProductos(){
        for(Producto producto : productos){
            System.out.println(producto.getNombre() + " " + producto.getPrecio() + " " +  producto.getSeccion() + " " + "$" + producto.getStock() );
        }
    }


}
