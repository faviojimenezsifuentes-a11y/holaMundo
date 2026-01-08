package POO;

public class PostImagen extends Publicacion{
    private String UrlImagen;

    public PostImagen(String autor, String texto, String urlImagen) {
        super(autor, texto);
        UrlImagen = urlImagen;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Imagen: "+UrlImagen);
    }
}
