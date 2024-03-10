package atividade2.Aula8;

public class Au8Ex3 {
    public static void main(String[] args) {
        System.out.println(pell(4));
    }
    public static int pell(int n) {
        if(n == 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        return 2 * pell(n - 1) + pell(n - 2);
    }
}
