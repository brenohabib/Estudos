package atividade.Aula7;

public class Au7Ex1 {
    public static void main(String[] args) {
        int[][] matrix = buildMatrix(10, 10);
        printMatrix(matrix);
    }
    public static int[][] buildMatrix(int sizeX, int sizeY){
        int[][] matrix = new int[sizeX][sizeY];
        for (int x = 0; x < sizeX; x++){
            for (int y = 0; y < sizeY; y++){
                if(x < y){
                    matrix[x][y] = (2 * x) + (7 * y) - 2;
                }
                else if(x == y){
                    matrix[x][y] = ((3 * x)^2) - 1;
                }
                else{
                    matrix[x][y] = ((4 * x)^3) - ((5 * y)^2) + 1;
                }
            }
        }

        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println(" | ");
        }


        
    }
}
