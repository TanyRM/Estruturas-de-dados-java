package estruturas.filas;

public class FilaPrioridade<T> extends Fila<T>{

    public void enfileirar(T elemento) {
        // Sobrescrever o metodo enfileirar para considerar uma prioridade
        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for (i=0; i<this.tam; i++){
            if (chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.adiciona(i, elemento);
    }
}
