package atividade2.Aula3;

public class Au3Ex6 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {

        int maxLength = String.valueOf(matrix[matrix.length - 1][matrix[0].length - 1]).length();
        System.out.print(" ");
        for (int i = 0; i < (maxLength * matrix.length) + matrix.length * 3 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                String number = String.valueOf(matrix[i][j]);
                int padding = (maxLength - number.length()) / 2;
                System.out.printf(" | %" + maxLength + "s", centralizeString(number, padding));
            }
            System.out.println(" | ");
            System.out.print(" ");
            for (int j = 0; j < (maxLength * matrix.length) + matrix.length * 3 + 1; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static String centralizeString(String input, int padding) {

        StringBuilder result = new StringBuilder(input.length() + 2 * padding);
        for (int i = 0; i < padding; i++) {

            result.append(" ");
        }
        result.append(input);

        for (int i = 0; i < padding; i++) {

            result.append(" ");
        }
        return result.toString();
    }
}
