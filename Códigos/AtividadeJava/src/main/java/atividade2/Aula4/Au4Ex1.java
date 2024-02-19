package atividade2.Aula4;

public class Au4Ex1 {
    public static void main(String[] args) {
        System.out.println(fatorial(4));
    }
    public static int fatorial(int number){
        if(number == 0){
            return 1;
        }
        return number * fatorial(number - 1);
    }
}
