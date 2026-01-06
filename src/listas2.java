import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Vector;
public class listas2 {
    public static void main(String[] args) {
        int n = 100_000;
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for(int i = 0 ; i < n; i++){
            arraylist.add(i);
            linkedList.add(i);
        }

        //arrayList
        long inicioArray = System.currentTimeMillis();
        for(int i = 0 ; i < n ; i++){
            arraylist.get(i);
        }
        long finArray = System.currentTimeMillis();

        //LinkedList
        long inicioLinked = System.currentTimeMillis();
        for(int i = 0 ; i < n ; i++){
            linkedList.get(i);
        }
        long finALinked = System.currentTimeMillis();

        System.out.println("ArrayList get(i): "+ (finArray - inicioArray)+ "ms");
        System.out.println("LinkedList get(i): "+ (finALinked - inicioLinked)+ "ms");

        Vector<String> names = new Vector<>();
        names.add("Favio");
        names.add("Sifuentes");
        System.out.println(names);
    }


}
