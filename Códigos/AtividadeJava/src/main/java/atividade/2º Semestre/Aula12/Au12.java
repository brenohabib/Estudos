package atividade.Aula12;

public class Au12 {
    public static void main(String[] args) {

        //Exercício 1: Ordenação por linha com Bubble
        Ex.ex1();

        //Exercício 2: Ordenação por coluna com Insertio
        //Ex.ex2();

        //Exercício 3: Encontrar menor valor com Selection
        //Ex.ex3();

        //Exercício 4: Ordenar a diagonal principal com Bubble
        //Ex.ex4();

        //Exercício 5: Ordenar linhas com bubble, colunas com Insertion e diagonal com Selection
        //Ex.ex5();
    }

    public class Ex {
    
        public static void ex1() {

            int[][] matrix = new int[3][3];
            matrix = Matrix.randomMatrix(matrix);
            System.out.println("Unsorted matrix: ");
            Matrix.printMatrix(matrix);

            for (int[] row : matrix) {
                Sort.bubbleSort(row);
            }
            System.out.println("Sorted matrix: ");
            Matrix.printMatrix(matrix);

        }
        
        public static void ex2() {
            int[][] matrix = new int[4][4];
            matrix = Matrix.randomMatrix(matrix);
            System.out.println("Unsorted matrix: ");
            Matrix.printMatrix(matrix);

            matrix = Matrix.transposeMatrix(matrix);
            for (int[] column : matrix) {
                Sort.insertionSort(column);
            }
            matrix = Matrix.transposeMatrix(matrix);

            System.out.println("Sorted Matrix: ");
            Matrix.printMatrix(matrix);
        }
    
        public static void ex3() {
            int[][] matrix = new int[5][5];
            matrix = Matrix.randomMatrix(matrix);
            System.out.println("Unsorted matrix: ");
            Matrix.printMatrix(matrix);

            for (int[] row : matrix) {
                Sort.selectionSort(row);
            }
            matrix = Matrix.transposeMatrix(matrix);

            for (int[] column : matrix) {
                Sort.selectionSort(column);
            }
            System.out.println("O menor elemento da matriz é " + matrix[0][0]);
        }
    
        public static void ex4() {

            int[][] matrix = new int[4][4];
            matrix = Matrix.randomMatrix(matrix);
            System.out.println("Unsorted matrix: ");
            Matrix.printMatrix(matrix);

            int[] diagonal = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                diagonal[i] = matrix[i][i];
            }

            Sort.bubbleSort(diagonal);

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = diagonal[i];
            }

            System.out.println("Sorted Matrix: ");
            Matrix.printMatrix(matrix);

        }
    
        public static void ex5() {
        
            int[][] matrix = new int[3][3];
            matrix = Matrix.randomMatrix(matrix);
            System.out.println("Unsorted matrix: ");
            Matrix.printMatrix(matrix);

            //linhas
            for (int[] rows : matrix) {
                Sort.bubbleSort(rows);
            }
            System.out.println("Sorted rows: ");
            Matrix.printMatrix(matrix);
            //colunas
            matrix = Matrix.transposeMatrix(matrix);
            for (int[] column : matrix) {
                Sort.insertionSort(column);
            }
            matrix = Matrix.transposeMatrix(matrix);
            System.out.println("Sorted columns: ");
            Matrix.printMatrix(matrix);
            //diagonal
            int[] diagonal = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                diagonal[i] = matrix[i][i];
            }
            Sort.bubbleSort(diagonal);

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = diagonal[i];
            }
            System.out.println("Sorted diagonal: ");
            Matrix.printMatrix(matrix);
        }
    }

    public class Sort {

        public static int[] selectionSort(int[] array) {

            for (int i = 0; i < array.length - 1; i++) {
                int key = i;
                for (int j = i; j < array.length; j++) {
                    if (array[j] < array[key]) {

                        key = j;

                    }

                }
                int temp = array[key];
                array[key] = array[i];
                array[i] = temp;

            }
            return array;

        }

        public static int[] insertionSort(int[] array) {
            int key, i, j;

            for (i = 1; i < array.length; i++) {
                key = array[i];
                j = i - 1;

                while (j >= 0 && key < array[j]) {
                    array[j + 1] = array[j];
                    j--;

                }
                array[j + 1] = key;
            }
            return array;
        }

        public static int[] bubbleSort(int[] array) {

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int aux = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = aux;
                    }
                }
            }

            return array;
        }

    }

    public class Matrix {
        
        public static int[][] randomMatrix(int[][] matrix) {

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {

                    matrix[i][j] = (int) (Math.random() * 101);

                }
            }
            return matrix;
        }

        public static void printMatrix(int[][] matrix) {

            int maxLength = String.valueOf(matrix[matrix.length - 1][matrix[0].length - 1]).length() + 1;
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

        public static int[][] transposeMatrix(int[][] matrix) {
            int[][] transposedMatrix = new int[matrix.length][matrix[0].length];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    transposedMatrix[i][j] = matrix[j][i];
                }
            }

            return transposedMatrix;
        }
    }
}
