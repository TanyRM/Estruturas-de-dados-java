package estruturas.arrays;

import java.util.LinkedList;

public class LinkedTestes {
    public static void main (String[] args){
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5); // Adiciona na ultima posição
        lista.add(0,1); // Adiciona em posição especifica
        lista.addFirst(0); // Adiciona na primeira posição
        System.out.println(lista);

        lista.remove(); // Remove o elemento da primeira posição
        lista.removeLast(); // Remove o elemento da ultima posição
        lista.remove(1); // Remove o elemento de uma posição especifica
        System.out.println(lista);

        System.out.println(lista.size()); // Retorna o tamanho da lista

        System.out.println(lista.indexOf(4)); // Retorna a posição de um determinado elemento

        System.out.println(lista.get(2)); // Retorna o elemento de uma determinada posição

        lista.clear(); // Limpa a lista
    }
}
