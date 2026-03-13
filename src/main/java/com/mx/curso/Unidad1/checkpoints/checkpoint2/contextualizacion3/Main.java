package com.mx.curso.Unidad1.checkpoints.checkpoint3;

public class Main {
    public static void main(String[] args) {

        Precision p = new Precision();
        p.calcularResultado();

        ErrorCuadraticoMedio mse = new ErrorCuadraticoMedio();
        mse.calcularResultado();
    }
}
