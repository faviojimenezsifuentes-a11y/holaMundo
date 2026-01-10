package POO.multiple;

public class WhatsApp implements Notificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando la notificacion por Whatsapp");

    }
}
