package estruturas.filas;

import java.util.LinkedList;
import java.util.Queue;

public class FilaTestes {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>(); // java não possui classe nativa para filas

        fila.add(1); // enfileirar
        fila.add(2);
        System.out.println(fila);

        System.out.println(fila.peek()); // espiar
        System.out.println(fila.remove()); //desenfileirar
        System.out.println(fila);
    }
}
