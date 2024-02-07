package estruturas.stacks;

import estruturas.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        // retorna o ultimo elemento da pilha
        if (this.vazia()) {
            return null;
        }
        return this.elementos[tam - 1];
    }

    public T desempilha() {
        // remove o ultimo elemento da pilha
        if (this.vazia()) {
            return null;
        }
		T elemento = this.elementos[tam-1];
		tam--;

		return elemento;
        // return this.elementos[--tam] -versão simplificada do código acima
    }
}