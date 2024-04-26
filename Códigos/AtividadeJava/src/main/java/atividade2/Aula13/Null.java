package atividade2.Aula13;

public class Null {
    public static void main(String[] args) {
        Object numero = null;
        try {
            numero.toString();
        } catch (NullPointerException e) {
            System.out.println("Impossível utilizar um método de uma variável nula");
        }
    }
}
