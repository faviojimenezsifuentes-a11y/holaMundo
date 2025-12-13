public class ForEach {
    public static void main(String[] args) {
        /*
        for(tipo de variable : arreglo)
        Se usa para recorrer arreglos sin indices
         */

        String[] nombres={"Jordy", "Ana", "Luis", "Favio"};
        for(String i : nombres){
            System.out.println(i);
        }

        String[] nombres1={"Adele", "Artic Monkey", "Faraon", "runo Mars", "Avicii"};
        System.out.println("Artistas que epiecen con la letra: A");
        for(String artista : nombres1){
            if(artista.startsWith("A")){
                System.out.println(artista);
            }
        }
    }
}
