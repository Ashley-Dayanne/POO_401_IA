package com.mx.curso.Unidad1;

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


public class Main {
    public static void main(String[] args) {

        Precision p = new Precision();
        p.calcularResultado();

        ErrorCuadraticoMedio mse = new ErrorCuadraticoMedio();
        mse.calcularResultado();
    }
}

