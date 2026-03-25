package com.mx.curso.Unidad2.abstraccion;

import java.util.List;

abstract class ProcesadorNLP {
    protected String textoCrudo;

    // Método concreto
    public void cargarTexto(String texto) {
        this.textoCrudo = texto;
    }

    // Métodos abstractos (contrato)
    public abstract List<String> tokenizer();
    public abstract void limpiarTexto();
    public abstract Object transformarParaModelo();
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProcesadorSimple extends ProcesadorNLP {

    private List<String> tokens = new ArrayList<>();

    @Override
    public List<String> tokenizer() {
        tokens = Arrays.asList(textoCrudo.split(" "));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        textoCrudo = textoCrudo.toLowerCase()
                .replace(".", "")
                .replace(",", "");
    }

    @Override
    public Object transformarParaModelo() {
        return tokens.size(); // conteo de palabras
    }
}

import java.util.*;

class ProcesadorAnalisisSentimiento extends ProcesadorNLP {

    private List<String> tokens = new ArrayList<>();
    private Map<String, Integer> frecuenciaPositivas = new HashMap<>();

    // Lista simple de palabras positivas
    private List<String> palabrasPositivas = Arrays.asList(
            "bueno", "excelente", "feliz", "genial", "increible"
    );

    private List<String> stopWords = Arrays.asList(
            "el", "la", "los", "las", "un", "una", "y", "de"
    );

    @Override
    public List<String> tokenizer() {
        tokens = Arrays.asList(textoCrudo.split(" "));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        textoCrudo = textoCrudo.toLowerCase()
                .replace(".", "")
                .replace(",", "");

        // Volver a tokenizar después de limpiar
        tokens = new ArrayList<>(Arrays.asList(textoCrudo.split(" ")));

        // Eliminar stop-words
        tokens.removeIf(stopWords::contains);
    }

    @Override
    public Object transformarParaModelo() {
        for (String palabra : tokens) {
            if (palabrasPositivas.contains(palabra)) {
                frecuenciaPositivas.put(
                        palabra,
                        frecuenciaPositivas.getOrDefault(palabra, 0) + 1
                );
            }
        }
        return frecuenciaPositivas;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String texto = "El sistema es excelente, un producto increible y muy bueno.";

        List<ProcesadorNLP> procesadores = new ArrayList<>();

        procesadores.add(new ProcesadorSimple());
        procesadores.add(new ProcesadorAnalisisSentimiento());

        for (ProcesadorNLP procesador : procesadores) {
            System.out.println("\n=== NUEVO PROCESADOR ===");

            procesador.cargarTexto(texto);

            procesador.limpiarTexto();
            System.out.println("Tokens: " + procesador.tokenizer());

            Object resultado = procesador.transformarParaModelo();
            System.out.println("Resultado final: " + resultado);
        }
    }
}