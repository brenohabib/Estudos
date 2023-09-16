package AtividadesJava.Aula6;

public class Au6Ex9 {
    public static void main(String[] args) {
        System.out.println(verificadorMultiplo(8));
    }
    public static boolean verificadorMultiplo(int numero){
        if (numero % 3 == 0){
            return true;
        }else{
            return false;
        }
    }
}
