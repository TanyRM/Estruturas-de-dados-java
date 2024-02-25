package estruturas.listas;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tam=0;
    private final int NAO_ENCONTRADO = -1;
    private final String NAO_EXISTE = "Posição não existe.";
    private final String LISTA_VAZIA = "Lista está vazia.";

    public void adicionar(T elemento){ // Adiciona um elemento no fim da lista e guarda o primeiro e ultimo elemento
        No<T> celula = new No<T>(elemento);
        if(this.tam == 0 ) {
            this.inicio = celula;
        } else {
            this.ultimo.setProx(celula);
        }
        this.ultimo = celula;
        this.tam++;
    }

    public void adicionarInicio(T elemento) { // Adiciona um elemento no inicio da lista
        if (this.tam == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<>(elemento, this.inicio);
            this.inicio = novoNo;
        }
        this.tam++;
    }

    public void adicionar(int posicao, T elemento) { // Adiciona um elemento em qualquer posicao da lista
        if (this.posExiste(posicao)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        if (posicao == 0) { // Se está vazia
            this.adicionarInicio(elemento);
        } else if (posicao == this.tam) { // Adiciona no ultimo
            this.adicionar(elemento);
        } else { // Adiciona no meio
            No<T> noAnterior = this.buscaNo(posicao);
            No<T> proximoNo = noAnterior.getProx();
            No<T> novoNo = new No<>(elemento, proximoNo);
            noAnterior.setProx(novoNo);
            this.tam++;
        }
    }

    public int getTamanho(){ // Retorna o tamanho da lista
        return this.tam;
    }

    public void limpar(){ // Iguala todos os valores a null
        for (No<T> atual = this.inicio; atual != null; ){
            No<T> proximo = atual.getProx();
            atual.setElemento(null);
            atual.setProx(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tam = 0;
    }

    private boolean posExiste(int posicao) {
        return !(posicao >= 0 && posicao <= this.tam);
    }

    public T buscaPorPos(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int busca(T elemento) {
        No<T> noAtual = this.inicio;
        int pos = 0;

        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProx();
        }
        return NAO_ENCONTRADO;
    }

    private No<T> buscaNo(int posicao) {
        if (this.posExiste(posicao)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProx();
        }
        return noAtual;
    }

    public T removeInicio() {
        if (this.tam == 0) {
            throw new RuntimeException(LISTA_VAZIA);
        }
        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProx();
        this.tam--;

        if (this.tam == 0) {
            this.ultimo = null;
        }
        return removido;
    }

    public T removeFinal() {
        if (this.tam == 0) {
            throw new RuntimeException(LISTA_VAZIA);
        }
        if (this.tam == 1) {
            return this.removeInicio();
        }
        No<T> penultimoNo = this.buscaNo(this.tam - 2);
        T removido = penultimoNo.getProx().getElemento();
        penultimoNo.setProx(null);
        this.ultimo = penultimoNo;
        this.tam--;

        return removido;
    }

    private boolean posicaoNaoExiste(int posicao) {
        return !(posicao >= 0 && posicao <= this.tam);
    }

    public T remove(int posicao) {
        if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        if (posicao == 0) {
            return this.removeInicio();
        }
        if (posicao == this.tam - 1) {
            return this.removeFinal();
        }
        No<T> noAnterior = this.buscaNo(posicao - 1);
        No<T> atual = noAnterior.getProx();
        No<T> proximo = atual.getProx();
        noAnterior.setProx(proximo);
        atual.setProx(null);
        this.tam--;

        return atual.getElemento();
    }

    @Override
    public String toString() {
        if(this.tam == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        No<T> atual = this.inicio;
        for (int i=0; i<this.tam-1;i++){
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProx();
        }
        builder.append(atual.getElemento()).append("]"); // Exibe o ultimo elemento sem , e finaliz o array

        return builder.toString();
    }
}
