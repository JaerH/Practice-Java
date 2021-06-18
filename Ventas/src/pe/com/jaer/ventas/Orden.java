package pe.com.jaer.ventas;

import java.util.List;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Ya no se pueden agregar productos");
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            if(productos[i] != null){
                total = total + this.productos[i].getPrecio();
            }
        }

        return total;
    }

}
