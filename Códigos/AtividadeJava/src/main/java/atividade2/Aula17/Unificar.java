package atividade2.Aula17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.io.FileNotFoundException;

import atividade2.Menu;

public class Unificar {
    static Menu fileMenu = new Menu("Unificador", 80, 10);

    public static void main(String[] args) {

        fileMenu.start();

        try {
            FileReader texto1 = new FileReader("texto1.txt");
            BufferedReader leitor1 = new BufferedReader(texto1);

            FileReader texto2 = new FileReader("texto2.txt");
            BufferedReader leitor2 = new BufferedReader(texto2);

            File concatenado = new File("concatenado.txt");
            FileWriter escritor = new FileWriter(concatenado);
            BufferedWriter bufferEscritor = new BufferedWriter(escritor);

            if (!concatenado.exists()) {
                criarArquivo("concatenado.txt");
            }

            String linha1, linha2;
            while ((linha1 = leitor1.readLine()) != null && (linha2 = leitor2.readLine()) != null) {
                bufferEscritor.write(linha1);
                bufferEscritor.newLine();
                bufferEscritor.write(linha2);
                bufferEscritor.newLine();
            }

            bufferEscritor.close();
            escritor.close();
            leitor1.close();
            leitor2.close();

        } catch (FileNotFoundException e) {
            System.err.println("Não foi possível achar o arquivo: ");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Não foi possível alterar o arquivo: ");
            e.printStackTrace();
        }

        fileMenu.text("Arquivo concatenado com sucesso!", 4);
    }

    private static void criarArquivo(String nome) {
        try {
            File arquivo = new File(nome);
            if (arquivo.createNewFile()) {
                fileMenu.text("Arquivo criado: " + arquivo.getName(), 4);
            } else {
                fileMenu.text("O arquivo já existe.", 4);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo.");
            e.printStackTrace();
        }
    }

}
