package org.Programa;

/**
 * 7. (Médio) Escreva uma função que inverta uma fila usando uma pilha auxiliar.
 */

public class Atividade7 {
    int size = 0;
    int capacity = 10;
    int[] queue = new int[capacity];
    int[] stack = new int[capacity];

    public static void main(String[] args) {

    }

    public Atividade7() {

    }

    public void populateArray() {
        for (int i = 0; i < queue.length; i++) {
            queue[i] = i;
        }
    }

}
