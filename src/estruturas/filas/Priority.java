package estruturas.filas;

import java.util.PriorityQueue; // Classe nativa para criar filas com prioridade
import java.util.Queue;

public class Priority {
    public static void main(String[] args){
        Queue<Integer> filaPrioridade = new PriorityQueue<Integer>();

        filaPrioridade.add(2);
        filaPrioridade.add(1);

        System.out.println(filaPrioridade);
    }
}
