package POO.multiple;

public class EMAIL implements Notificacion{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando la notificacion por EMAIL: "+mensaje);
    }
}
