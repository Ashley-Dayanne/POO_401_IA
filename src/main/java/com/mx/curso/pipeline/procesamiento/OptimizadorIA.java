package com.mx.curso.pipeline.procesamiento;


import java.util.ArrayList;
import java.util.List;

public class OptimizadorIA {
    protected String nombreAlgoritmo;

    public void ajustarParametros() {
        System.out.println("ajustando parametros");
    }
}

class DescensoGradiente extends OptimizadorIA {

    public DescensoGradiente() {
        nombreAlgoritmo = "Descenso de Gradiente";
    }

    @Override
    public void ajustarParametros() {
        System.out.println(nombreAlgoritmo + ": Calculando derivadas parciales y actualizando pesos...");
    }
}


class AlgoritmoGenetico extends OptimizadorIA {

    public AlgoritmoGenetico() {
        nombreAlgoritmo = "Algoritmo Genetico";
    }

    @Override
    public void ajustarParametros() {
        System.out.println(nombreAlgoritmo + ": Aplicando cruce, mutacion y seleccion natural de individuos...");
    }
}


public class Main {
    public static void main(String[] args) {

        List<OptimizadorIA> lista = new ArrayList<>();

        OptimizadorIA o1 = new DescensoGradiente();
        OptimizadorIA o2 = new AlgoritmoGenetico();

        lista.add(o1);
        lista.add(o2);

        for (OptimizadorIA o : lista) {
            o.ajustarParametros();
        }
    }
}