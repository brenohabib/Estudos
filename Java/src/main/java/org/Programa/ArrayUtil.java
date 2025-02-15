package org.Programa;

/**
 * Classe de utilitários comuns usados para manipular arrays.
 *
 */
public class ArrayUtil {

    /**
     * Imprime o array passado no parâmetro em uma linha.
     *
     * @param array Array a ser imprimido.
     */
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    /**
     * Verifica se o array está cheio.
     *
     * @param array Array a ser verificado.
     * @param size Quantidade de elementos no array.
     * @return "true" caso estiver cheio, "false" caso contrário
     */
    public static boolean isFull(int[] array, int size) {
        return size == array.length;
    }

    /**
     * Verifica se o array está vazio.
     *
     * @param size Quantidade de elementos no array.
     * @return "true" caso estiver vazio, "false" caso contrário
     */
    public static boolean isEmpty(int size) {
        return size == 0;
    }
}
