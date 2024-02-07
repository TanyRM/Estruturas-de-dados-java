package estruturas.stacks;

public class Testes {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i=1; i<=10; i++){
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

        System.out.println(pilha.vazia());

        System.out.println(pilha.topo());

        pilha.desempilha();
        pilha.desempilha();
        System.out.println(pilha);
    }
}
