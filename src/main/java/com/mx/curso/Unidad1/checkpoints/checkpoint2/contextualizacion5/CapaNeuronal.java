package com.mx.curso.Unidad1.checkpoints.checkpoint2.contextualizacion5;

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
