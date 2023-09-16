package AtividadesJava.Aula7;

/*criar matriz que é resposta dos alunos, vetor é gabarito, verificar e imprimir o resultado final */

public class Exemplo {
    public static void main(String[] args) {
        int[][] matriz = new int[5][10];
        int[] array = new int[10];
        criarMatriz(matriz);
        printMatrix(matriz);
        criarArray(array);
        printArray(array);
        verificarAcertos(matriz, array);
    }

    public static int[][] criarMatriz(int[][] matriz){

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = (int)(Math.random()*4);
            }   
        }

        return matriz;
    }

    public static void printMatrix(int[][] matrix){

        System.out.println("Printing matrix. . .");
        System.out.println();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){

                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println(" | <--- Aluno " + (i + 1));
        }
        System.out.println();
    }

    public static int[] criarArray(int[] array){

        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*4);
        }

        return array;
    }

    public static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){
            System.out.print(" | " + array[i]);
        }
        System.out.println(" | <--- Gabarito\n");
    }

    public static void verificarAcertos(int[][] matriz, int[] gabarito){

        int acertos = 0, erros = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length;j++){
                if(matriz[i][j] == gabarito[j]){

                    acertos++;

                }else{

                    erros++;

                }
            }
            System.out.printf("Aluno %d: |acertos = %d | erros = %d|\n",i + 1, acertos, erros);
            acertos = 0;
            erros = 0;
        }
    }
}
