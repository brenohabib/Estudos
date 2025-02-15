package org.Arquitetura;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        atividade1();
        //atividade2();
    }

    public static void atividade1() {
        String texto = "A a maravilhosa PEROLA negra ao leite";
        List<String> palavras = new ArrayList<>(List.of());
        palavras.addAll(Arrays.asList(texto.split(" ")));

        System.out.println("Texto original: " + texto);

        List<String> dadosMinusculos = Filter.converterParaMinusculas(palavras);
        System.out.println("Converter para minúsculas: " + dadosMinusculos);

        List<String> semRepeticao = Filter.removerRepetidas(dadosMinusculos);
        System.out.println("Remover repetições: " + semRepeticao);

        List<String> semPalavrasCurtas = Filter.removerPalavrasCurtas(semRepeticao);
        System.out.println("Remover palavras curtas: " + semPalavrasCurtas);

        List<String> dadosOrdenados = Filter.ordenarPalavras(semPalavrasCurtas);
        System.out.println("Ordenar em ordem alfabética: " + dadosOrdenados);
    }

    public static void atividade2() {
        Layer.ClienteUI ui = new Layer.ClienteUI();
        ui.iniciar();
    }
}
