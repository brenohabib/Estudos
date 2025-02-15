package org.Programa;

/**
 * 1. (Fácil) Crie um array de inteiros com 10 posições e preencha-o com os
 * números de 1 a 10. Em seguida, exiba todos os valores.
 */
public class Atividade1 {
    private int size = 10;
    private int [] array = new int[size];

    public static void main(String [] args) {
        new Atividade1();
    }

    /**
     * Cria e imprime o array
     */
    public Atividade1() {
        array = populateArray(array);
        ArrayUtil.printArray(array);
    }

    /**
     * Popula o array de 1 a 10.
     * @param arr Array a ser populado.
     * @return Retorna o array passado como parâmetro populado.
     */
    public int[] populateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
