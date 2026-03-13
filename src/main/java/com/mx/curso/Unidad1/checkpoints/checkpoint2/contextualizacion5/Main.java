package com.mx.curso.Unidad1.checkpoints.checkpoint2.contextualizacion5;

public class Main {
    public static void main(String[] args) {

        CapaConvolucional conv = new CapaConvolucional();
        conv.propagacionHaciaAdelante();

        CapaDensa densa = new CapaDensa();
        densa.propagacionHaciaAdelante();
    }
}
