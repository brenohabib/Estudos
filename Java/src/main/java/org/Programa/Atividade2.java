package org.Programa;

/**
 * 2. (Fácil) Implemente uma pilha utilizando um array e implemente os métodos
 * push, pop e peek.
 */
public class Atividade2 {
    private int[] stack;

    public static void main(String[] args) {
        new Atividade2();
    }

    /**
     * Fiz uma lógica de pilha dinâmica.
     * Mostro primeiramente a pilha vazia e empurro alguns valores dentro
     * dela (10, 20 e 30) e mostro novamente com os valores inseridos. É testado
     * também os métodos pop() e peek(), respectivamente.
     */
    public Atividade2() {
        stack = new int[0];
        ArrayUtil.printArray(stack);
        push(10);
        push(20);
        push(30);
        ArrayUtil.printArray(stack);
        System.out.println(pop());
        System.out.println(peek());
        ArrayUtil.printArray(stack);
    }

    /**
     *Cria uma cópia do array para o novo valor a ser inserido, logo após, insere
     * na posição final.
     * @param num Valor a ser inserido.
     */
    public void push(int num) {
        int[] newStack = new int[stack.length + 1];

        System.arraycopy(stack, 0, newStack, 0, stack.length);
        newStack[newStack.length - 1] = num;
        stack = newStack;
    }

    /**
     * Retira o último elemento inserido diminuindo o tamanho do array em um.
     * @return Retorna o valor retirado.
     */
    public int pop() {
        int poppedElement = stack[stack.length - 1];

        int[] newStack = new int[stack.length - 1];
        System.arraycopy(stack, 0, newStack, 0, stack.length - 1);
        stack = newStack;

        return poppedElement;
    }

    /**
     * @return Retorna o último valor inserido.
     */
    public int peek() {
        return stack[stack.length - 1];
    }
}