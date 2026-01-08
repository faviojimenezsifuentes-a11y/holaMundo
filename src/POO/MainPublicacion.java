package POO;

import java.util.ArrayList;
import java.util.List;

public class MainPublicacion {
    public static void main(String[] args) {
        List<Publicacion> publicacion = new ArrayList<>();

        publicacion.add(new PostImagen("Ana","Almuerzo de hoy", "img_0001_jpg"));
        publicacion.add(new PostVideo("Luis","Entrenamiento", 45));
        publicacion.add(new PostImagen("Favio","Vista de la clase", "img_0002_jpg"));
        publicacion.add(new PostVideo("Arturo","Cocinando", 120));
        publicacion.add(new PostImagen("Adrian","Cena", "img_0003_jpg"));

        int cantidadImagen = 0;
        int cantidadvideo = 0;
        System.out.println("=========== Feed =========");
        for(Publicacion p : publicacion){
            p.mostrar();
            System.out.println();
            //instanceof
            if(p instanceof PostImagen) cantidadImagen++;
            else if (p instanceof  PostVideo) cantidadvideo++;


        }
        System.out.println("Total PostImagen: "+cantidadImagen);
        System.out.println("Total PostVideo: "+cantidadvideo);

        //Extra
        boolean encontrado = false;
        for(Publicacion p : publicacion){
            if (p.getAutor().equalsIgnoreCase("Ana")){
                encontrado = true;
                break;
            }
        }
        System.out.println(encontrado? "Encontrado autor ANA" : "No encontrado autro ANA");
    }
}
