package Exercitiu2;

import java.util.HashMap;
import java.util.Map;

public class MapWithSum {

    private static Map<String, Integer> sumaNotelor = new HashMap<>();

    public static void main(String[] args) {

        addNote("Anca", 8);
        System.out.println(sumaNotelor.get("Anca"));

    }

    /**
     *               adaugam note
     *
     * @param nume
     * @param nota
     */
    public static void addNote(String nume, Integer nota){
        //verifica daca "nume" e in lista
        if (sumaNotelor.containsKey(nume)){
            //daca da, atunci update suma

            Integer sumaVeche = sumaNotelor.get(nume);
            sumaNotelor.put(nume, sumaVeche+nota);
        }else {
            sumaNotelor.put(nume, nota);
            //daca nu, o adauga in Map
        }

        //TODO
    }
}
