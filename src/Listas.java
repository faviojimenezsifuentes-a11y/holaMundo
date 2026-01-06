import java.util.*;

public class Listas {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Ana"); // repetido: Si se permite

        System.out.println(nombres);
        System.out.println(nombres.get(1));

        nombres.remove(1);
        System.out.println(nombres.get(1));
        //Vector ahora hoy en dia obsoleto en java
        Vector<String> names = new Vector<>();
        names.add("Favio");
        names.add("Sifuentes");
        System.out.println(names);

        //Set:No imprime repetidos,si encuentra solo imprime una vez, no guarda el repetido
        Set<String> Linkedhasset = new LinkedHashSet<>();
        Linkedhasset.add("Java");
        Linkedhasset.add("Python");
        Linkedhasset.add("C++");
        Linkedhasset.add("Java");

        System.out.println(Linkedhasset);

        //treeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("C++");
        treeSet.add("Java");

        System.out.println(treeSet);

        //hashSet
        Set<String> hashset = new HashSet<>();
        hashset.add("Java");
        hashset.add("Python");
        hashset.add("C++");
        hashset.add("Java");

        System.out.println(hashset);
        //imprimiendo
        System.out.println(hashset.contains("Java"));
        for(String lenguajes: hashset){
            System.out.println(lenguajes);
        }




    }
}
