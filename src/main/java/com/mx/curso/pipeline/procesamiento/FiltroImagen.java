package com.mx.curso.pipeline.procesamiento;

public class FiltroImagen {    public void aplicar() {
    System.out.println("Aplicando filtro a la imagen...");
}
}

class DetectorDeBordes extends FiltroImagen {

    @Override
    public void aplicar() {
        System.out.println("Aplicando detector de bordes con kernel.");
    }
}

class ReductorDeRuido extends FiltroImagen {

    @Override
    public void aplicar() {
        System.out.println("Aplicando reducción de ruido con kernel.");
    }
}

public class Main {
    public static void main(String[] args) {

        DetectorDeBordes bordes = new DetectorDeBordes();
        bordes.aplicar();

        ReductorDeRuido ruido = new ReductorDeRuido();
        ruido.aplicar();
    }
}

