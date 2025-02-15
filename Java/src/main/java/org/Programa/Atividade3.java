package org.Programa;

/**
 * 3. (Fácil) Crie uma fila utilizando um array e implemente os métodos enqueue e
 * dequeue.
 */
public class Atividade3 {

    private int capacity = 10;
    private int size = 0;
    private int[] array = new int[capacity];

    public static void main(String[] args) {
        new Atividade3();
    }

    /**
     * Fiz uma lógica de fila "dinâmica"
     * Mostro o array vazio e logo após enfileiro alguns valores (10, 20 e 30)
     * após isso mostro os valores enfileirados. Utilizo o méthodo de
     * desenfileirar e mostro o valor retirado e o array após a remoção.
     */
    public Atividade3() {
        ArrayUtil.printArray(array);
        enqueue(10);
        enqueue(20);
        enqueue(30);

        ArrayUtil.printArray(array);
        System.out.println(dequeue());
        ArrayUtil.printArray(array);
    }

    /**
     * Adiciona um valor na fila utilizando a quantidade de valores inseridos
     * nela como índice.
     * @param num Valor a ser inserido.
     */
    public void enqueue(int num) {
        if (ArrayUtil.isFull(array, size)) {
            resize();
        }

        array[size] = num;
        size++;
    }

    /**
     * Redimensiona o array para o dobro de sua capacidade
     */
    //FIXME: A capacidade pode fazer o array consumir uma quantidade exagerada de memória
    public void resize() {
        int[] newArray = new int[capacity *= 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    /**
     * Remove o valor na primeira posição da fila.
     * @return Retorna o valor removido.
     */
    public int dequeue() {
        int element = array[0];
        for (int i = 0; i < size; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return element;
    }
}
