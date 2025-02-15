package org.Programa;

/**
 * 4. (Médio) Implemente um deque usando um array, permitindo inserção e
 * remoção em ambas as extremidades.
 */

public class Atividade4 {
    private int front = -1;
    private int rear = 0;
    private int size = 0;
    private int capacity = 10;
    private int[] deque = new int[capacity];

    public static void main(String[] args) {
        new Atividade4();
    }

    /**
     * Utilizei uma lógica parecida com a lista circular.
     * Mostro primeiramente o deque vazio e faço algumas inserções
     * logo em seguida, primeiras posições com os valores 10, 30, 40 e 60
     * e últimas posições 20, e 50, eu mostro os valores inseridos.
     * Utilizo o méthodo de remover o primeiro e último valor e mostro
     * eles respectivamente com o deque alterado.
     * Foi utilizado, de forma indireta, um pivô no primeiro elemento,
     * utilizando ele como o "centro" do deque.
     */

    public Atividade4() {
        ArrayUtil.printArray(deque);
        addFirst(10);
        addLast(20);
        addFirst(30);
        addFirst(40);
        addLast(50);
        addFirst(60);
        ArrayUtil.printArray(deque);
        System.out.println(removeFirst());
        ArrayUtil.printArray(deque);
        System.out.println(removeLast());
        ArrayUtil.printArray(deque);
    }

    /**
     * Adiciona um valor na primeira posição ou ao lado esquerdo do deque.
     * @param num Valor a ser inserido.
     */
    public void addFirst(int num) {
        if (ArrayUtil.isFull(deque, size)) {
            return;
        }
        if (ArrayUtil.isEmpty(size)) {
            rear = 0;
            front = rear;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        deque[front] = num;
        size++;
    }

    /**
     * Adiciona um valor na primeira posição ou ao lado direito do deque.
     * @param num Valor a ser inserido.
     */
    public void addLast(int num) {
        if (ArrayUtil.isFull(deque, size)) {
            return;
        }
        if (ArrayUtil.isEmpty(size)) {
            rear = 0;
            front = rear;
        } else {
            rear = (rear + 1) % capacity;
        }
        deque[rear] = num;
        size++;
    }

    /**
     * Remove o primeiro valor do deque (lado esquerdo).
     * @return Retorna o valor removido.
     */

    public int removeFirst() {
        if (ArrayUtil.isEmpty(size)) {
            return 0;
        }
        int item = deque[front];
        deque[front] = 0;
        if (front == rear) {
            rear = -1;
            front = rear;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return item;
    }

    /**
     * Remove o último valor do deque (lado direito).
     * @return Retorna o valor removido.
     */

    public int removeLast() {
        if (ArrayUtil.isEmpty(size)) {
            return 0;
        }
        int item = deque[rear];
        deque[rear] = 0;
        if (front == rear) {
            rear = -1;
            front = rear;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        return item;
    }
}
