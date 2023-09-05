public class Au8Ex2 {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new int[size][size];
        int[] array = new int[size * size];
        int x = matrix.length / 2, y = matrix[0].length / 2;
        int steps = 0, direction = 4, totalSteps = 0;

        array = fibonacci(array);

        while (totalSteps < size * size) {
            for (int i = 0; i < steps; i++) {
                if (totalSteps < size * size) {

                    matrix[x][y] = array[totalSteps];
                    totalSteps++;
                } else {

                    break;
                }

                if (direction == 0) { // Para a esquerda

                    x--;

                } else if (direction == 1) { // Para cima

                    y--;

                } else if (direction == 2) { // Para a direita

                    x++;

                } else if (direction == 3) { // Para baixo

                    y++;
                }
            }

            if (direction == 0 || direction == 2) {
                steps++;
            }

            direction = (direction + 1) % 4;
        }

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        
        int maxLength = String.valueOf(matrix[matrix.length - 1][matrix[0].length - 1]).length();
        System.out.println(" -----------------------------------------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                String number = String.valueOf(matrix[i][j]);
                int padding = (maxLength - number.length()) / 2;
                System.out.printf(" | %" + maxLength + "s", centralizeString(number, padding));
            }
            System.out.println(" | ");
            System.out.println(" -----------------------------------------");
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

    public static int[] fibonacci(int[] array){

        array[0] = 0;
        array[1] = 1;
    
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
    
        return array;
    }
}