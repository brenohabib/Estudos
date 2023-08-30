public class Ex4 {
    public static class MatrixA {

        private int[][] matrixA = new int[4][10];

        public void buildMatrix(){

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 10; j++) {

                matrixA[i][j] = j;

                }
            }
        }

        public void printMatrix(){

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 10; j++) {

                System.out.print(matrixA[i][j] + " ");

                }

        System.out.println();

            }
        }
    }

    public static class MatrixB {

        private int[][] matrixB = new int[5][10];
        private int multiplicador = 0;

        public void buildMatrix(){

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    
                    matrixB[i][j] = multiplicador * j;
                    multiplicador++;

                }
            multiplicador = 0;
            }
        }

        public void printMatrix(){

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {

                System.out.print(matrixB[i][j] + " ");

                }

            System.out.println();

            }
        }
    }
    
    public static class MatrixC {

        private int[][] matrixC = new int[6][6];

        public void buildMatrix(){

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {

                    matrixC[i][j] = (i % 2) + 1;

                }
            }
        }

        public void printMatrix(){

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {

                    System.out.print(matrixC[i][j] + " ");

                }

                System.out.println();

            }
        }
    }
    public static void main(String[] args) {
        
        MatrixA matrixA = new MatrixA();
        matrixA.buildMatrix();
        matrixA.printMatrix();

        System.out.println();

        MatrixB matrixB = new MatrixB();
        matrixB.buildMatrix();
        matrixB.printMatrix();

        System.out.println();

        MatrixC matrixC = new MatrixC();
        matrixC.buildMatrix();
        matrixC.printMatrix();

    }
}
