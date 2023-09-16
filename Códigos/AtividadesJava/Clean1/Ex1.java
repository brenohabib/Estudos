package AtividadesJava.Clean1;

public class Ex1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int result = sumPlusMult(num1, num2);
        System.out.println("O resultado é: " + result);
    }

    public static int sumPlusMult(int mult, int sum) {
        int multiplication = mult * 2;
        int add = sum + 10;
        int result = add + multiplication;
        return result;
    }
}
