
public class Au6Ex12 {
    public static void main(String[] args) {
        System.out.println(parOuImpar(2));
    }
    public static String parOuImpar(int numero){
        if(numero % 2 == 0){
            return "Par";
        }else{
            return "Impar";
        }
    }
}
