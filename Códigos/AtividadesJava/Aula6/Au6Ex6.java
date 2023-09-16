package AtividadesJava.Aula6;

public class Au6Ex6 {
    public static void main(String[] args) {
        intervaloPar(1, 10);
        intervaloImpar(1, 10);
    }
    public static void intervaloImpar(int start, int end){
        for(int i = start; i <= end; i++){
            if(i % 2 != 0){
                System.out.print(" | " + i);
            }
        }
        System.out.println();
    }
        public static void intervaloPar(int start, int end){
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                System.out.print(" | " + i);
            }
        }
        System.out.println();
    }

}
