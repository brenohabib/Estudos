package org.Arquitetura;

import java.util.*;

public class Filter {
    public static List<String> converterParaMinusculas(List<String> lista) {
        List<String> texto = new ArrayList<>();
        for (String palavra : lista) {
            texto.add(palavra.toLowerCase());
        }
        return texto;
    }

    public static List<String> removerRepetidas(List<String> lista) {
        return new ArrayList<>(new LinkedHashSet<>(lista));
    }

    public static List<String> removerPalavrasCurtas(List<String> lista) {
        List<String> texto = new ArrayList<>();
        for (String palavra : lista) {
            if (palavra.length() >= 3) {
                texto.add(palavra);
            }
        }
        return texto;
    }

    public static List<String> ordenarPalavras(List<String> lista) {
        List<String> texto = new ArrayList<>(lista);
        Collections.sort(texto);
        return texto;
    }
}