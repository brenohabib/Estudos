package atividade.Aula14;

public class Au14Ex4 {
    //Implemente uma função recursiva mdc(a, b) para calcular o MDC de dois números.
    public static void main(String[] args) {
        System.out.println(mdc(8, 12));
    }
    public static int mdc(int a, int b) {
        if(b == 0){
            return a;
        }
        else{
            return mdc(b, a % b);
        }
    }
}
