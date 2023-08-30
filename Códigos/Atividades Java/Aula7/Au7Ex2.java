
/* Em Java que realize a multiplicação de duas matrizes A e B, resultando em uma
terceira matriz C.
a) O programa deve começar pedindo ao usuário as dimensões das matrizes A e
B. Lembre-se de que a multiplicação de matrizes só é possível se o número de
colunas de A for igual ao número de linhas de B.
b) Após obter as dimensões, o programa deve pedir ao usuário para preencher as
matrizes A e B.
c) Implemente uma função multiplicaMatrizes que tome as matrizes A e B como
argumentos e retorne a matriz C.
d) Exiba a matriz C resultante da multiplicação.
e) Crie um Vetor com a Matriz C e ordene de forme decrescente, ou seja, do
maior para o menor. */


import java.util.Scanner;
public class Au7Ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matrixA = buildMatrix(input);
        int[][] matrixB = buildMatrix(input);
        int[][] matrixC;
        int pos = 0;

        if(possibleMult(matrixA, matrixB)){

            matrixC = multiply(matrixA, matrixB);
            printMatrix(matrixC);

            int[] vector = new int[matrixC.length * matrixC[0].length];

            for(int i = 0; i < matrixC.length; i++){
                for(int j = 0; j < matrixC[0].length; j++){

                    vector[pos] = matrixC[i][j];
                    pos++;
                }
            }

            vector = sortVector(vector);
            printVector(vector);
        }
        System.out.println("Finished process");
        
    }

    public static int[][] buildMatrix(Scanner input){

        int sizeX, sizeY;

        System.out.println("Digite a dimensao X da matriz: ");
        sizeX = input.nextInt();

        System.out.println("Digite a dimensao Y da matriz: ");
        sizeY = input.nextInt();

        int[][] matrix = new int[sizeX][sizeY];

        for (int x = 0; x < sizeX; x++){
            for (int y = 0; y < sizeY; y++){
                
                System.out.printf("\nDigite a posicao(%d, %d)", x, y);
                matrix[x][y] = input.nextInt();
            }
        }
        
        System.out.println();
        return matrix;
    }


    public static void printMatrix(int[][] matrix){

        System.out.println("Printing matrix. . .");
        System.out.println();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){

                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println(" | ");
        }
        System.out.println();
    }


    public static boolean possibleMult(int[][] matrixA, int[][] matrixB){

        int cols = matrixA[0].length;
        int rows = matrixB.length;

        if(cols != rows){

            System.out.println("Impossible to multiply!");
            return false;
        }
        else{

            System.out.println("Valid to multiply!");
            return true;
        }
    }

    public static int[][] multiply(int[][] matrixA, int[][] matrixB){
        
        int rows = matrixA.length;
        int cols = matrixB[0].length;
        int depth = matrixA[0].length;

        int[][] matrixC = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                for(int k = 0; k < depth; k++){

                    matrixC[i][j] += matrixA[i][k] * matrixB [k][j];
                }
            }
        }
        return matrixC;
    }

    public static int[] sortVector(int vector[]){

        int aux;

        for(int i = 0; i < vector.length; i++){
            for(int j = 0; j < vector.length; j++){
                if(vector[i] > vector[j]){

                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }

        return vector;
    }

    public static void printVector(int vector[]){

        System.out.println("Printing vector. . .");
        System.out.println();

        for(int i = 0; i < vector.length; i++){

            System.out.print(" | " + vector[i]);
        }

        System.out.println(" | \n");
    }
}
