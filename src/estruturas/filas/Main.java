package estruturas.filas;

public class Main {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.vazia());
        System.out.println(fila.tamanho());

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        System.out.println(fila.toString());

        System.out.println(fila.espiar());

        fila.desenfileirar();
        System.out.println(fila.toString());
    }
}
