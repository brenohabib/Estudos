package atividade2.Aula12;

import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {
    public static void main(String[] args) {
        String caminhoArquivo = "Hello World.txt";

        try {
            FileWriter escritor = new FileWriter(caminhoArquivo);

            escritor.write("Você achou que seria um Hello World mas sou EU, DIO!.");

            escritor.close();
        } catch (IOException e) {
            System.out.println("Não deu certo... " + e.getMessage());
        }
    }
}
