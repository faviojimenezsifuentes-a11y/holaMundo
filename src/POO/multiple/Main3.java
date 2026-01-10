package POO.multiple;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Notificacion> Noti = new ArrayList<>();
        Noti.add(new EMAIL());
        Noti.add(new SMS());
        Noti.add(new WhatsApp());
        for(Notificacion n:Noti){
            n.enviar("Hola, este es una notificacion importante");
        }
    }
}
