package POO;

import java.util.ArrayList;
import java.util.List;


public class producto_main {
    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<>();
        Producto producto1 = new Producto();
        producto1.setNombre("Laptop");
        producto1.setPrecio(3400);

        Producto producto2 = new Producto();
        producto2.setNombre("Mouse");
        producto2.setPrecio(120);

        Producto producto3 = new Producto();
        producto3.setNombre("Tv");
        producto3.setPrecio(5000);

        lista.add(producto1);
        lista.add(producto2);
        lista.add(producto3);

        double total = 0;

        for(Producto producto : lista){
            if(producto.getPrecio() > 0){
                producto.mostrar();
                total+=producto.getPrecio();
            }
        }
        System.out.println("El total es: "+total);
    }
}
