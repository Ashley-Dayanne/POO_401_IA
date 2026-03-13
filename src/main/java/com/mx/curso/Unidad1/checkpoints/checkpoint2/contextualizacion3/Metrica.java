package com.mx.curso.Unidad1.checkpoints.checkpoint2.contextualizacion3;

class Metrica {
    public void calcularResultado() {
        System.out.println("Calculando resultado de la métrica...");
    }
}

class Precision extends Metrica {

    @Override
    public void calcularResultado() {
        System.out.println("Calculando Accuracy (Precisión).");
    }
}

class ErrorCuadraticoMedio extends Metrica {

    @Override
    public void calcularResultado() {
        System.out.println("Calculando Error Cuadrático Medio (MSE).");
    }
}

