package estruturas.filas;

public class PrioridadeTestes {
    public static void main(String[] args) {
        FilaPrioridade<Integer> fila = new FilaPrioridade<>();

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(2);

        System.out.println(fila);
    }
}
