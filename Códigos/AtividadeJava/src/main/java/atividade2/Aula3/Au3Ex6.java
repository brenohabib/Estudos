package atividade2.Aula3;

public class Au3Ex6 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 1}, {4, 5, 1}, {1,1,1}};
        printMatrix(matrix);
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String number = String.valueOf(matrix[i][j]);
                String formattedNumber = String.format("%-" + (number.length()) + "s", number);
                System.out.printf("| %s ", formattedNumber);
            }
            System.out.println("|");
        }
        System.out.println();
    }
}
