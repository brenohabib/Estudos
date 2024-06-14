package atividade2.Aula15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import atividade2.Menu;

public class ContagemLetras {

    public static int contarVogais() {
        int vogais = 0;
        try {
            FileReader leitorArquivo = new FileReader("mensagem.txt");
            BufferedReader leitorCaractere = new BufferedReader(leitorArquivo);
            String linha;
            while ((linha = leitorCaractere.readLine()) != null) {
                for (int i = 0; i < linha.length(); i++) {
                    char caractere = Character.toLowerCase(linha.charAt(i));
                    if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                        vogais++;
                    }
                }
            }
            leitorCaractere.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vogais;
    }

    public static int contarConsoantes() {
        int consoantes = 0;
        try {
            FileReader leitorArquivo = new FileReader("mensagem.txt");
            BufferedReader leitorCaractere = new BufferedReader(leitorArquivo);
            String linha;
            while ((linha = leitorCaractere.readLine()) != null) {
                for (int i = 0; i < linha.length(); i++) {
                    char caractere = Character.toLowerCase(linha.charAt(i));
                    if (caractere >= 'a' && caractere <= 'z' && caractere != 'a' && caractere != 'e'
                         && caractere != 'i' && caractere != 'o' && caractere != 'u') {
                        consoantes++;
                    }
                }
            }
            leitorCaractere.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return consoantes;
    }
    
    public static void main(String[] args) {
        int vogais = contarVogais();
        int consoantes = contarConsoantes();
        Menu contagemMenu = new Menu("Super contador de Letras", 100);
        contagemMenu.start();
        contagemMenu.text("Quantidade de vogais: " + vogais, 3);
        contagemMenu.text("Quantidade de consoantes: " + consoantes, 4);
    }
}
