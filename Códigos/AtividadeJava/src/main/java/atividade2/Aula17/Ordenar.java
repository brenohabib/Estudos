package atividade2.Aula17;

import java.io.*;
import java.util.*;
import atividade2.Menu;

public class Ordenar {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Ordenador", 80, 10);
        mainMenu.start();
        ordenarNumeros();
        mainMenu.text("Texto ordenado com sucesso!", 4);
    }

    public static void ordenarNumeros() {
        try {
            File arquivo = new File("numeros.txt");
            FileReader leitor = new FileReader(arquivo);
            BufferedReader bufferLeitura = new BufferedReader(leitor);
            String linha = bufferLeitura.readLine();
            leitor.close();

            String[] numerosString = linha.split(",");
            Integer[] numeros = new Integer[numerosString.length];
            for (int i = 0; i < numerosString.length; i++) {
                numeros[i] = Integer.parseInt(numerosString[i]);
            }

            Arrays.sort(numeros, Collections.reverseOrder());

            FileWriter escritor = new FileWriter(arquivo);
            BufferedWriter bufferEscrita = new BufferedWriter(escritor);
            for (int i = 0; i < numeros.length; i++) {
                bufferEscrita.write(numeros[i].toString());
                if (i != numeros.length - 1) {
                    bufferEscrita.write(",");
                }
            }
            bufferEscrita.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
