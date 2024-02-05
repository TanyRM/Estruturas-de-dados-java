package estruturas.arrays;

import java.util.Arrays;

// Forma de generalizar o tipo do vetor usando a superclasse Object
public class VetorObject {
    private Object[] elementos;
    private int tam;

    public VetorObject(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tam = 0;
    }

    public void adiciona1(Object elemento) {
        // Itera por todos os elementos do vetor até encontrar um valor nulo
        this.aumentaCapacidade();
        for (int i=0; i<this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                tam++; //linha usada para acompanhar o metodo adicionar2
                break;
            }
        }
    }

    public boolean adiciona2(Object elemento) {
        // Guarda a informação da posição em que o último valor foi armazenado
        this.aumentaCapacidade();
        if(this.tam<this.elementos.length) {
            this.elementos[this.tam] = elemento;
            this.tam++;
            return true;
        }
        System.out.println("O vetor já está cheio");
        return false;
    }

    public int tamanho() {
        // retorna o tamanho atual de um vetor
        return this.tam;
    }

    public String toString(){
        // usando StringBuilder para mostrar apenas as posições com elementos
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

    public String toString1(){
        // retorna o vetor com todas as posições incluindo os valores null
        return Arrays.toString(elementos);
    }

    public Object busca(int posicao) {
        // exibe o elemento de uma determinada posição
        if (!(posicao >= 0 && posicao < tam)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int buscaElemento(Object elemento) {
        // verifica a existência de um determinado elemento
        for (int i=0; i<this.tam; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean adicionar(int posicao, Object elemento){
        // adicionar elemento em qualquer posições ocupadas do vetor
        if (!(posicao >= 0 && posicao < tam)){
            // verificar se a posição existe
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        for (int i=this.tam-1; i>=posicao; i--){
            // mover elementos
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tam++;

        return false;
    }

    private void aumentaCapacidade(){
        // aumentar a capacidade de um vetor ao adicionar um novo elemento (cria um novo vetor e transfere elementos)
        if (this.tam == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao) {
        // remove um elemento em qualquer posição do vetor
        if (!(posicao >= 0 && posicao < tam)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i=posicao; i<this.tam-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tam--;
    }
}
