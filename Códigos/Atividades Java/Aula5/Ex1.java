/*1. Criar uma matriz quadrada de 25 posições com valores aleatórios entre 0 e 25. Após isso:
● Exibir todos os elementos da matriz;
● Contar quantos números pares existem;
● Contar quantos números ímpares existem.*/


public class Ex1 {

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        int pares = 0, impares = 0;


        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = (int)(Math.random()*25);
                System.out.print(" | " + matriz[i][j]);
                if(matriz[i][j] % 2 == 0){
                    pares++;
                }else{
                    impares++;
                }
            }
        }
        System.out.print("\npares: "+ pares);
        System.out.print("\nimpares: "+ impares);
    }
}