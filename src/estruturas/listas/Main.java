package estruturas.listas;

public class Main {
    public static void main(String[] args){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(5);

        System.out.println(lista);
        System.out.println("Tamanho = " + lista.getTamanho());

        System.out.println(lista.busca(0));
        System.out.println(lista.busca(1));

        System.out.println(lista.buscaPorPos(0));

        lista.adicionar(2,6);
        lista.adicionar(1, 4);
        lista.adicionarInicio(1);
        System.out.println(lista);

        lista.removeInicio();
        lista.remove(1);
        lista.removeFinal();
        System.out.println(lista);

        lista.limpar();
        System.out.println(lista);
    }
}
