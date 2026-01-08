package POO;

public class Producto {
    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 0) {
            this.precio = precio;
        }
    }
    public void mostrar(){
        System.out.println("Producto: "+nombre+ " - S/"+precio);
    }
}
