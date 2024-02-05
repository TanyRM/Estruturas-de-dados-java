package estruturas.arrays;

public class Testes {
    public static void main(String[] args) {
        int i=0;

        Vetor vetor = new Vetor(3);

        vetor.adiciona1("elemento 1");
        vetor.adiciona1("elemento 2");

        vetor.adiciona2("elemento 3");

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
        System.out.println(vetor.toString1());

        System.out.println(vetor.busca(0));

        System.out.println(vetor.buscaElemento("elemento 1"));
        System.out.println(vetor.buscaElemento("elemento 4"));

        vetor.adicionar(0, "elemento 4");
        System.out.println(vetor);

        vetor.remove(1);
        System.out.println(vetor);

        //para remover um elemento especifico usando os metodos buscaElemento e remove
        int posicao = vetor.buscaElemento("elemento 2");
        if (posicao != -1){
            vetor.remove(posicao);
            System.out.println(vetor);
        } else {
            System.out.println("Esse elemento não existe");
            System.out.println(vetor);
        }

        boolean existe = vetor.contains("elemento 3");
        System.out.println(existe);

        vetor.adiciona2("elemento 1");
        vetor.adiciona2("elemento 4");
        System.out.println(vetor);
        int ultimo = vetor.lastIndexOf("elemento 4");
        if (ultimo != -1){
            System.out.println(ultimo);
        } else {
            System.out.println("O elemento não existe no vetor");
        }

        vetor.clear();
        System.out.println(vetor);
    }
}