
public class Au6Ex10 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    public static int fatorial(int numero){
        if(numero > 0){
            
            for(int i = numero - 1; i != 1; i--){
                numero *= i;
            }
            return numero;
        }else{
            return 0;
        }
    }
}
