package atividade2.Aula16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import atividade2.Menu;

public class ConverterHtmlEmTxt {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Conversor de HTML 2000");
        removeTags();
        try {
            FileReader arquivoTexto = new FileReader("index.txt");
            BufferedReader leitorTexto = new BufferedReader(arquivoTexto);

            mainMenu.applyChanges();
            String linha;
            int i = 1;
            while ((linha = leitorTexto.readLine()) != null) {
                mainMenu.text(linha, i++).left();
            }

            leitorTexto.close();
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo index.html não encontrado!");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Erro: Falha ao ler arquivos!");
            e.printStackTrace();
        }
    }

    public static void removeTags() {
        try {
            FileReader arquivoHTML = new FileReader("index.html");
            BufferedReader leitorHTML = new BufferedReader(arquivoHTML);

            FileWriter arquivoTexto = new FileWriter("index.txt");
            BufferedWriter escritorTexto = new BufferedWriter(arquivoTexto);

            String linha;
            while ((linha = leitorHTML.readLine()) != null) {
                String textoSemTags = linha.replaceAll("<[^>]*>", "");

                escritorTexto.write(textoSemTags);
                escritorTexto.newLine();
            }

            leitorHTML.close();
            escritorTexto.close();

            System.out.println("Arquivo index.txt criado com sucesso!");

        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo index.html não encontrado!");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Erro: Falha ao ler ou escrever arquivos!");
            e.printStackTrace();
        }
    }
}
