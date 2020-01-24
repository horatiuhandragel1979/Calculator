import java.util.*;

public class MainV2 {

    public static void main(String[] args) {
        PersoanaV2 p1 = new PersoanaV2("1791012082418", "Horatiu", "0742061318", 40);
        PersoanaV2 p2 = new PersoanaV2("1791012082418", "Horatiu", "0742061318", 40);
        PersoanaV2 p3 = new PersoanaV2("1791012082418", "Horatiu", "0742061318", 40);
        PersoanaV2 p4 = new PersoanaV2("179101", "Horatiu", "0742061318", 40);
        PersoanaV2 p5 = new PersoanaV2("17910120", "Horatiu", "0742061318", 40);


        /**
         * set nu accepta duplicatele
         * obiectele se adauga in set pentru a elimina duplicatele
         */
        Set<PersoanaV2> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        for (PersoanaV2 p : set) {
            System.out.println(p);

        }

        /**
         * equals() pentru a vedea daca doua obiecte sunt identice
         */
//        if (p1.equals(p2)) //  p1 == p2
//        {
//            System.out.println("Persoanele sunt egale");
//        } else {
//            System.out.println("Persoanele NU sunt egale");
//        }
//    }


        // String  -  cheia reprezinta numele unui cursant
        // Integer  - valoarea reprezinta numarul de absente

        Map<String, Integer> absente = new HashMap<>();
        absente.put("Anca", 7);    //(cheie,valoare)
        absente.put("Radu", 1);   //prima este tot timpul cheia, key
        absente.put("Dani", 0);

        Set<String> listaDeNume = absente.keySet(); // keySet returneaza un set

        for (String nume : listaDeNume) {
            System.out.println(nume + " are " + absente.get(nume) + " absente");
        }


        Map<String, ArrayList<Integer>> noteTeme = new HashMap<>();
        ArrayList<Integer> noteAnca = new ArrayList<>();
        noteAnca.add(10);
        noteAnca.add(8);
        noteAnca.add(9);
        noteTeme.put("Anca", noteAnca);

        ArrayList<Integer> noteDani = new ArrayList<>();
        noteDani.add(9);
        noteDani.add(9);
        noteTeme.put("Anca", noteAnca);

        //add note to Dani
        ArrayList<Integer> noteDaniNew = noteTeme.get("Dani");
        noteDaniNew.add(10);
        noteTeme.put("Dani", noteDaniNew);
        System.out.println();

        // creaza for
    }

   // Queue<String> q = new PriorityQueue<>();

}
