package atividade2.Aula16;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import atividade2.Menu;

public class ArmazenarVetor {
    private int[][] matriz = new int[8][8];

    public ArmazenarVetor() {
        preencherMatriz();
    }

    private void preencherMatriz() {
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    public void salvarParabola() {
        int[] posicoes = {00, 11, 22, 33, 34, 25, 16, 07};
        try (PrintWriter writer = new PrintWriter(new FileWriter("Vetor.txt"))) {
            for (int posicao : posicoes) {
                int linha = (posicao / 10) % 10;
                int coluna = posicao % 10;
                writer.println(matriz[linha][coluna]);
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArmazenarVetor armazenarVetor = new ArmazenarVetor();
        Menu mainMenu = new Menu("Imprimidor de parabolas");
        mainMenu.applyChanges();
        armazenarVetor.salvarParabola();

        mainMenu.text("Arquivo Vetor.txt criado com sucesso!", 4);

    }
}
