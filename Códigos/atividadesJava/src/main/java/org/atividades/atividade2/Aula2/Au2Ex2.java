package atividade2.Aula2;

public class Au2Ex2 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    public static int fatorial(int num) {

        if (num < 0) {
            return 0;
        }
        else {
            if(num == 0) {
                return 1;
            }
            else{
                int fatorial = num;
                for (int i = 0; i < num; i++) {
                    num--;
                    fatorial *= num;
                }
                return fatorial;
            }
        }
    }
}
