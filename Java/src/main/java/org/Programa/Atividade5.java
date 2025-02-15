package org.Programa;

/**
 * 5. (Médio) Dada uma string contendo apenas parênteses, chaves e colchetes,
 * implemente uma função que determine se a sequência está balanceada. Use
 * uma pilha.
 */

public class Atividade5 {
    private String balanceString = "";
    private int bracketBalance = 0;
    private int parenthesisBalance = 0;
    private int bracesBalance = 0;

    public static void main(String[] args) {
        new Atividade5();
    }

    /**
     * Fiz uma lógica em que, caso os contadores são 0, está balanceado.
     * Caso for adicionado caracteres fechando, por exemplo, ')', ']' e '}'
     * será ignorada do contador. A cada caractere aberto contará em mais um
     * em seu respectivo contador.
     * <hr>
     * Empurro primeiramente alguns valores redundantes para os contadores
     * (abrindo e fechando respectivamente) e logo após, empurro os valores
     * '[', '[', '}', '(' e '(' e mostro a string. Utilizo o méthodo pop() e
     * mostro o valor retirado (nesse caso, o valor '(') e logo em seguida,
     * começo a contar a quantidade de aberturas e fechamentos feitos no array
     * e mostro esses valores. Por último, utilizo o méthodo peek() para mostrar
     * o último caractere da String.
     */

    public Atividade5() {
        for (int i = 0; i < 5; i++) {
            push('[');
            push(']');
            push('{');
            push('}');
            push('(');
            push(')');
        }
        push('[');
        push('[');
        push('}');
        push('(');
        push('(');
        System.out.println(balanceString);
        System.out.println("Popped : " + pop());
        for (int i = 0; i < balanceString.length(); i++) {
            countBrackets(i);
            countBraces(i);
            countParentheses(i);
        }
        System.out.println("Brackets [] count : " + bracketBalance);
        System.out.println("braces {} count : " + bracesBalance);
        System.out.println("parenthesis () count : " + parenthesisBalance);
        System.out.println("Último caractere : " + peek());
    }

    /**
     * Adiciono um caractere na String.
     * @param c caractere a ser inserido.
     */
    public void push(char c) {
        balanceString += c;
    }

    /**
     * Remove o último caractere da String.
     * @return retorna o valor removido.
     */
    public char pop() {
        char poppedChar = balanceString.charAt(balanceString.length() - 1);
        balanceString = balanceString.substring(0, balanceString.length() - 1);
        return poppedChar;
    }

    /**
     * @return Retorna o último caractere da String.
     */
    public char peek() {
        return balanceString.charAt(balanceString.length() - 1);
    }

    /**
     * Conta a quantidade de colchetes na String.
     * @param index índice utilizado para percorrer a String.
     */
    public void countBrackets(int index) {
        if (balanceString.charAt(index) == '[') {
            bracketBalance++;
        }
        if (balanceString.charAt(index) == ']') {
            if (bracketBalance > 0) {
                bracketBalance--;
            }
        }
    }

    /**
     * Conta a quantidade de parênteses na String.
     * @param index índice utilizado para percorrer a String.
     */
    public void countParentheses(int index) {
        if (balanceString.charAt(index) == '(') {
            parenthesisBalance++;
        }
        if (balanceString.charAt(index) == ')') {
            if (parenthesisBalance > 0) {
                parenthesisBalance--;
            }
        }
    }

    /**
     * Conta a quantidade de chaves na String.
     * @param index índice utilizado para percorrer a String.
     */
    public void countBraces(int index) {
        if (balanceString.charAt(index) == '{') {
            bracesBalance++;
        }
        if (balanceString.charAt(index) == '}') {
            if (bracesBalance > 0) {
                bracesBalance--;
            }
        }
    }
}
