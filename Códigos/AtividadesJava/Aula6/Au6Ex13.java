package AtividadesJava.Aula6;


public class Au6Ex13 {

    public static void main(String[] args) {
        System.out.println(valorAbsoluto(3));
    }
    public static int valorAbsoluto(int numero){
        numero *= numero;
        numero = (int)Math.sqrt(numero);
        return numero;
    }
}