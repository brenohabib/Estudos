package atividade2.Aula8;

public class Au8Ex2 {
    public static void main(String[] args) {
        System.out.println(tribonacci(10));
    }
    public static int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        else if(n == 2) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }
}
