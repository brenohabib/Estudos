package atividade2.Aula15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContagemLetras {

    public static int contarVogais() {
        int vogais = 0;
        try {
            FileReader fr = new FileReader("mensagem.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                for (int i = 0; i < linha.length(); i++) {
                    char caractere = Character.toLowerCase(linha.charAt(i));
                    if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                        vogais++;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vogais;
    }

    public static int contarConsoantes() {
        int consoantes = 0;
        try {
            FileReader fr = new FileReader("mensagem.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                for (int i = 0; i < linha.length(); i++) {
                    char caractere = Character.toLowerCase(linha.charAt(i));
                    if (caractere >= 'a' && caractere <= 'z' && caractere != 'a' && caractere != 'e' && caractere != 'i' && caractere != 'o' && caractere != 'u') {
                        consoantes++;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return consoantes;
    }

    public static void main(String[] args) {
        int vogais = contarVogais();
        int consoantes = contarConsoantes();
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de consoantes: " + consoantes);
    }
}
