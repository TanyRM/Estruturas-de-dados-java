package estruturas.base;

// Classe base que pode ser reusada em tipos de estruturas estaticas (filas e pilhas)
public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tam;

    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade]; // solução do livro effective Java
        this.tam = 0;
    }

    public EstruturaEstatica(){
        // construtor sem a capacidade passada como parametro
        this(1);
    }

    protected boolean adiciona(T elemento) {
        // adiciona um novo elemento ao final do array
        this.aumentaCapacidade();
        if (this.tam < this.elementos.length){
            this.elementos[this.tam] = elemento;
            this.tam++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento){
        // adiciona um elemento em uma determinada posição do array
        if (posicao < 0 || posicao > tam){
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();

        //mover todos os elementos
        for (int i=this.tam-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tam++;

        return true;
    }

    public boolean vazia(){
        // verifica se o array está vazio (se estiver retorna true)
        return this.tam == 0;
    }

    protected void remove(int posicao){
        // remove um elemento do array
        if (!(posicao >= 0 && posicao < tam)){
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i=posicao; i<tam-1; i++){
            elementos[i] = elementos[i+1];
        }
        tam--;
    }

    private void aumentaCapacidade(){
        // aumenta a capacidade de um array
        if (this.tam == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho(){
        // retorna o tamanho do array
        return this.tam;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tam-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tam>0){
            s.append(this.elementos[this.tam-1]);
        }

        s.append("]");

        return s.toString();
    }
}
