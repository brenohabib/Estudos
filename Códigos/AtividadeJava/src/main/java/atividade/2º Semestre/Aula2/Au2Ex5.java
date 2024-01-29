package atividade.Aula2;


public class Au2Ex5 {
    public static void main(String[] args) {
        int tamanho = 5;
        int[] vetA = new int[tamanho];
        int[] vetB = new int[tamanho];
        int[] vetC = new int[tamanho];
        int[] vetD = new int[vetA.length + vetB.length + vetC.length];

        for (int i = 0; i < vetA.length; i++){
            vetA[i] = (int)(Math.random()*10);
            vetB[i] = (int)(Math.random()*10);
            vetC[i] = (int)(Math.random()*10);

            vetD[i] = vetA[i];
            vetD[i + vetA.length] = vetB[i];
            vetD[i + vetA.length + vetB.length] = vetC[i];

        }
        for (int i = 0; i < vetD.length;i++){
            System.out.print(" | " + vetD[i]);
        }
    }
}
