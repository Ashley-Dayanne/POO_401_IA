package com.mx.curso.Unidad1.checkpoints.checkpoint2.contextualizacion3;

import com.mx.curso.Unidad1.checkpoints.checkpoint3.ErrorCuadraticoMedio;
import com.mx.curso.Unidad1.checkpoints.checkpoint3.Precision;

public class Main {
    public static void main(String[] args) {

        Precision p = new Precision();
        p.calcularResultado();

        ErrorCuadraticoMedio mse = new ErrorCuadraticoMedio();
        mse.calcularResultado();
    }
}
