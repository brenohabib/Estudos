package AtividadesJava.Aula6;

public class Au6Ex4 {
    public static void main(String[] args) {
        verificadorParImpar(2);
    }
    public static void verificadorParImpar(int numero){
        if (numero%2 == 0){
            System.out.println("Esse valor é par");
        }else{
            System.out.println("Esse valor é ímpar");
        }
    }
}
