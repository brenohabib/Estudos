package org.Programa;

import java.util.Arrays;

/**
 * 6. (Médio) Implemente uma fila circular utilizando um array, garantindo que a fila
 * reutilize os espaços vazios.
 */

public class Atividade6 {
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int capacity = 4;

    private String[] queue = new String[capacity];

    public static void main(String[] args) {
        new Atividade6();
    }

    /**
     * Utilizei uma lógica simples para fila circular com tamanho fixo.
     * Começo enfileirando as Strings "J", "A", "V", "A" e imprimo a fila na tela.
     * Removo o primeiro valor e mostro o valor removido.
     * Por último, utilizo o méthodo peek() para mostrar a última String.
     */

    public Atividade6() {
        enqueue("J");
        enqueue("A");
        enqueue("V");
        enqueue("A");
        System.out.println(Arrays.toString(queue));
        System.out.println("String removida : " + dequeue());
        System.out.println(Arrays.toString(queue));
        System.out.println("Última String : " + peek());
    }

    /**
     * Adiciona uma String na fila, movendo e mantendo o cursor de inserção
     * dentro do tamanho da capacidade.
     * @param item Valor a ser inserido na fila.
     */
    public void enqueue(String item) {
        if (size == capacity) {
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    /**
     * Remove a primeira string da lista, movendo e mantendo o cursor do
     * primeiro elemento não nulo dentro do tamanho da capacidade.
     * @return Retorna a String removida.
     */
    public String dequeue() {
        String item = queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    /**
     * @return Retorna a última String da fila.
     */
    public String peek() {
        return queue[front];
    }
}
