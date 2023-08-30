public class Au6Ex5 {
    public static void main(String[] args) {
        tabuada(5);
    }
    public static void tabuada(int numero){
        for(int i = 1;i <= 10; i++){
            System.out.printf("\n%d + %d = %d",i,numero, (numero * i));
        }
    }
}
