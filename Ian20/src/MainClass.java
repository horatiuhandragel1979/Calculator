import java.util.ArrayList;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {

        Persoane[] arrayPersoane = new Persoane[3];

        Somer somer = new Somer();
        Angajat angajat = new Angajat();
        Student student = new Student();

        arrayPersoane[0] = somer;
        arrayPersoane[1] = angajat;
        arrayPersoane[2] = student;

        for (int i = 0; i < arrayPersoane.length; i++) {

            System.out.println(arrayPersoane[i].getName());
        }
        ArrayList<Persoane> lista = new ArrayList();
        lista.add(somer);
        lista.add(angajat);
        lista.add(student);

//        for (int i = 0; i < lista.size(); i++) {
//            Object o = (Persoane) lista.get(i);  //cast (Persoane)
//
//        }
        System.out.println("\n ArrayList \n");
        for (Persoane p : lista) {
            System.out.println(p.getName());
        }

        LinkedList<Persoane> list = new LinkedList();
        list.add(somer);
        list.add(angajat);
        list.add(student);
        System.out.println("\n LinkedList \n");
        for (Persoane pers : lista) {
            System.out.println(pers.getName());
        }
        }

    }

