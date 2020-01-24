package Exercitiu;

import java.util.*;

public class MainV2 {

    public static void main(String[] args) {
        PersoanaV2 p1 = new PersoanaV2("Somer", "Horatiu");
        PersoanaV2 p2 = new PersoanaV2("Somer", "Lara");
        PersoanaV2 p3 = new PersoanaV2("Angajat", "Liam");
        PersoanaV2 p4 = new PersoanaV2("Student", "Andreea");


        Map<String, PersoanaV2> porecla = new HashMap<>();
        porecla.put("a", p1);    //(cheie,valoare)
        porecla.put("b", p2);     //prima este tot timpul cheia, key
        porecla.put("c", p3);
        porecla.put("d", p4);


        Set<String> listaDeNume = porecla.keySet(); // keySet returneaza un set

        for (String nume : listaDeNume) {
            System.out.println(nume+ " : " +porecla.get(nume).getNume() + " : "+porecla.get(nume).getOcupatia());

        }


    }
}
