public class Ex2 {
    public static void main(String[] args) {
        
        imprimirPar();

    }
    public static void imprimirPar(){
        for(int i = 0; i <= 100; i++){
            if(i%2 == 0){
                System.out.print(" | " + i);
            }
        }
    } 
    
}
