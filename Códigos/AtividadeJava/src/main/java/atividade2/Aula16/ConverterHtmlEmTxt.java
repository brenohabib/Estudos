package atividade2.Aula16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Menu.*;

public class ConverterHtmlEmTxt {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Conversor de HTML 2000", 80);
        mainMenu.start();
    }

        public static String leitor(String text) {
            try {
                FileReader arquivo = new FileReader("index.html");
                BufferedReader texto = new BufferedReader(arquivo);
                String linha;

                while ((linha = texto.readLine()) != null) {
                    for (String encontrado : linha.split(" ")) {
                        if (encontrado.contains(text)) {
                            // Copiei; refazer usando mesma lógica
                        }
                    }
                }
                texto.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
    }
}
