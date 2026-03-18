package com.mx.curso.Unidad1;

class CapaNeuronal {
    public void propagacionHaciaAdelante() {
        System.out.println("Realizando propagación hacia adelante...");
    }
}

class CapaConvolucional extends CapaNeuronal {

    @Override
    public void propagacionHaciaAdelante() {
        System.out.println("Transformando tensores con operación convolucional.");
    }
}

class CapaDensa extends CapaNeuronal {

    @Override
    public void propagacionHaciaAdelante() {
        System.out.println("Transformando tensores con capa densa.");
    }
}

public class Main {
    public static void main(String[] args) {

        CapaConvolucional conv = new CapaConvolucional();
        conv.propagacionHaciaAdelante();

        CapaDensa densa = new CapaDensa();
        densa.propagacionHaciaAdelante();
    }
}

