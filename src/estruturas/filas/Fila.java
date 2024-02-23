package estruturas.filas;

import estruturas.base.EstruturaEstatica;
public class Fila <T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }
    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileirar(T elemento) {
        this.adiciona(elemento); // metodo da classe mãe
        /* ou
            this.elementos[this.tam] = elemento;
            this.tam++;
        */
    }

    public T espiar() {
        // Retorna o primeiro elemento da fila
        if (this.vazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public void desenfileirar(){
        // Remove o primeiro elemento da fila
        if(this.vazia()){
            System.out.println("A fila está vazia");
        }
        this.remove(0);
    }
}
