package estruturas.stacks;

import java.util.Stack; // Classe padrão de java para realizar operações em pilhas

public class StackTeste {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(3); // Metodo .push() empilha um elemento no topo da pilha
        stack.push(1);
        stack.push(2);
        System.out.println(stack.isEmpty()); // Metodo .isEmpty() verifica se a pilha está vazia

        System.out.println(stack); // Retorna os elementos da pilha

        System.out.println(stack.size()); // Metodo .size() exibe o tamanho da pilha (quantos elementos possui)

        System.out.println(stack.peek()); // Metodo .peek() exibe o elemento no topo da pilha

        System.out.println(stack.pop()); // Metodo .pop() desempilha o último elemento da pilha
        System.out.println(stack);

        int posicao = stack.search(3); // Metodo .search(elemento) retorna a distancia da posição do elemento para o topo
        System.out.println("Distancia do topo:" + posicao);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
