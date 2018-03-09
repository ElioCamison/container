import java.util.*;

public class Containers {

    public static void main(String[] args) {
        System.out.println("--- LListes1 ---");
        llistes1();
        System.out.println("--- Iterators ---");
        iterators();
        System.out.println("--- Cua ---");
        cues();
        System.out.println("--- Piles ---");
        piles();
        System.out.println("--- Conjunts ---");
        conjunts();
        System.out.println("--- Mapes ---");
        mapes();

    }

    static void llistes1() {
        // Crea llista d'enters anomenada "l1"
        List<Integer> l1 = new ArrayList<Integer>();

        // Afegeix els números 10, 20 i 15
        l1.add(10);
        l1.add(20);
        l1.add(15);

        // Imprimeix la llista
        System.out.println(l1);

        // Elimina el segon element
        l1.remove(1);

        // Imprimeix la llista
        System.out.println(l1);

        // Crea llista d'enters anomenada "l2"
        List<Integer> l2 = new ArrayList<Integer>();

        // Afegeix els números 3, 6 i 9
        l2.add(3);
        l2.add(6);
        l2.add(9);

        // Afegeix la llista l1 a la llista l2
        for (int i = 0; i < l1.size(); i++) {
            l2.add(l1.get(i));
        }

        // Imprimeix la llista l2
        System.out.println(l2);

        // Elimina tots els valors de l1
        l1.removeAll(l1);

        // Afegeix els tres primers elements de l2 a l1
        for (int i = 0; i < 3; i++) {
            l1.add(l2.get(i));
        }

        // Comprova si dins l1 hi ha el número 6
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) == 6) {
                System.out.println(true);
            }
        }

        // Afegeix el numero 6 un altre cop a l1 al principi de la llista
        l1.add(0,6);
        System.out.println(l1);

        // Cerca la posicio de l'element que te el numero 9 a la llista l1
        System.out.println("-->" + l1.indexOf(9));

        /*for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) == 9){
                System.out.println(i);

            }
        }*/

        // A l1, substitueix l'element a la posició 1 per el valor 5
        System.out.println("Abans d'esborrar " + l1);
        l1.remove(l1.indexOf(6));
        l1.add(0,5);
        System.out.println("Després d'esborrar " + l1);
        // A l1, insereix a la posició 2 l'element 4
        l1.add(l1.indexOf(3),4);

        // Imprimeix la llista l1
        System.out.println(l1);

        // Converteix l1 a array i imprimeix-ho
        System.out.println(Arrays.toString(l1.toArray()));
    }

    static void iterators() {
        // Crea llista d'enters anomenada "l1"
        List<Integer> l1 = new ArrayList<Integer>();

        // Afegeix a l1 els elements 10, 20, 50 i 90
        l1.add(10);
        l1.add(20);
        l1.add(50);
        l1.add(90);

        // Treu Iterator (it)
        Iterator<Integer> it = l1.iterator();

        // Mentre hi hagi element següent, imprimeix l'element
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Torna a crear l'objecte iterator i has de recórrer la llista, però has d'esborrar l'element "50"

//        for (int i = 0; i < l1.size(); i++) {
//            if (l1.get(i) == 50) {
//                l1.remove(i);
//            }
//        }
        System.out.println("-->" + l1);
        it = l1.iterator();
        while (it.hasNext()){
            if (it.next() == 50){
                it.remove();
            }
        }
        System.out.println("-->" + l1);


        // Imprimeix la llista
        System.out.println(l1);
        // Crea un ListIterator de la llista l1 (anomenat "li")
        ListIterator<Integer> li = l1.listIterator();

        // Avança l'iterador fins al final de la llista
        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println();

        // Recorre la llista al reves amb l'iterador, imprimint els elements
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println();


        // Torna a recorrer la llista amb l'iterador, pero aquest cop imprimeix tambe l'index de l'element
        li = l1.listIterator();

        while (li.hasNext()){
            System.out.println(li.next() + " index " + li.nextIndex());
        }
        System.out.println();

    }

    static void cues() {
        // Declara una cua (anomenada "cua") com una LinkedList
        Queue<Integer> cua = new LinkedList<Integer>();

        // Afegeix els elements 12, 14 i 99 a la cua
        cua.add(12);
        cua.add(14);
        cua.add(99);

        // Mostra el primer element (sense treurer-lo) de la cúa i imprimeix-ho
        cua.peek();

        // Treu el primer element de la cúa
        cua.poll();
        // Imprimeix la cúa
        System.out.println(cua);

        // Declara una cúa de prioritat anomenada "cuaPrioritat"
        PriorityQueue<Integer> cuaPrioritat = new PriorityQueue<>();
        // Afegeix els elements 5, 2, -1, 9 i 7
        cuaPrioritat.add(5);
        cuaPrioritat.add(2);
        cuaPrioritat.add(-1);
        cuaPrioritat.add(9);
        cuaPrioritat.add(7);

        // Imprimeix la cúa
        System.out.println(cuaPrioritat);
        // Fes un bucle que vagi traient cada element i l'imprimeixi de la cúa de prioritat, mentre en quedin

    }

    static void piles() {
        // Declara una pila (stack) com una LinkedList

        // Push a la pila dels valors 15, 56, 21 i -5

        // Imprimeix la pila

        // Imprimeix el valor de damunt la pila, sense treurer-lo

        // Treu i imprimeix els valors de la pila

    }

    static void conjunts() {
        // Declara un conjunt d'enters anomenat "set"

        // Afegeix els elements 14, 6 i 3

        // Imprimeix el conjunt

        // Afegeix l'element 6 un altre cop

        // Imprimeix el conjunt


        // Construeix un conjunt de caràcters anomenat set2 (Usa la class Character, no char)
        // i introdueix totes les lletres de la paraula "ESTERNOCLEIDOMASTOIDEO"
        // Després, imprimeix el conjunt


        // Empra un iterador (it) per recórrer tot el conjunt de caràcters anterior i imprimeix element a element

    }

    static void mapes() {
        // Construeix un mapa (map) que associi un String amb un altre String

        // Introdueix el parell: "RENAULT" - "CLIO"

        // Introdueix el parell: "VOLKSWAGEN" - "GOLF"

        // Introdueix el parell: "PEUGEOT" - "308"

        // Introdueix el parell: "HONDA" - "CIVIC"

        // Introdueix el parell: "PEUGEOT" - "RCZ"

        // Imprimeix el mapa


        // Treu el conjunt de claus del mapa (variable kset)

        // Imprimeix aquest conjunt

        // Treu el valor de la clau "PEUGEOT" i imprimeix-ho

        // Mitjançant un iterador, imprimeix tots els parells clau-valor del mapa


        // Empra un mapa que associi un caràcter a un número enter per dur el compte
        // de quantes vegades surt cada lletra a la paraula "ESTERNOCLEIDOMASTOIDEO"


    }

}
