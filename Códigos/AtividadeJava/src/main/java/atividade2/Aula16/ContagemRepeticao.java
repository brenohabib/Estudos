package atividade2.Aula16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Menu.*;

public class ContagemRepeticao {
    public static void main(String[] args) {
        int quantidade;
        String texto;
        Menu mainMenu = new Menu("Contador de palavras 5000", 90);
        mainMenu.start();
        mainMenu.text("Escreva um texto para ser achado!", 3);
        quantidade = leitor(texto = mainMenu.input());

        mainMenu.start();
        mainMenu.text("Seu arquivo possui um total de " + quantidade + " palavras " + texto, 3);
    }

    public static int leitor(String text) {
        int contagem = 0;
        try {
            FileReader arquivo = new FileReader("contador.txt");
            BufferedReader texto = new BufferedReader(arquivo);
            String linha;

            while ((linha = texto.readLine()) != null) {
                for (String encontrado : linha.split(" ")) {
                    if (encontrado.contains(text)) {
                        contagem++;
                    }
                }
            }
            texto.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contagem;
    }
}
