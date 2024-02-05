package estruturas.arrays.arrayList;

//classe nativa de java para lidar com arrays
import java.util.ArrayList;
public class TestesArrayList {
    // Alguns metodos da classe ArrayList
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A"); // Metodo .add(elemento) adiciona elementos na ultima posição
        arrayList.add("C");
        arrayList.add(1, "B"); // Metodo .add(index, elemento) adiciona elementos pelo indice

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A"); // Metodo .contains(elemento) verifica se um determinado elemento existe no vetor
        if (existe){
            System.out.println("Elemento existe");
        } else {
            System.out.println("Elemento não existe");
        }

        int posicao = arrayList.indexOf("A"); // Metodo .indexOf(index) retorna o indice de um determinado elemento
        if (posicao != -1){
            System.out.println(posicao);
        } else {
            System.out.println("Elemento não existe");
        }

        String elemento = arrayList.get(2); // Metodo .get(indice) retorna o elemento que está em uma determinada posição
        System.out.println(elemento);

        arrayList.remove(0); // Metodo remove(index) remove o elemento de uma determinada posição
        System.out.println(arrayList);

        int tam = arrayList.size(); // Metodo .size() retorna o tamanho de um array
        System.out.println(tam);

        arrayList.set(1,"A"); // Metodo .set(index, elemento) substitui o valor de uma posição
        System.out.println(arrayList);

        arrayList.add("C");
        arrayList.add("A");

        int ultimo = arrayList.lastIndexOf("A"); // Metodo .lastIndexOf(elemento) retorna a posição da ultima ocorrencia do elemento
        System.out.println(ultimo);

        arrayList.clear(); // Metodo .clear() remove todos os elementos do array
        System.out.println(arrayList);

        boolean vazia = arrayList.isEmpty(); // Metodo .isEmpty() verifica se possui algum elemento no array
        if (vazia){
            System.out.println("O array não possui elementos");
        } else {
            System.out.println("O array possui elementos");
        }
    }
}
