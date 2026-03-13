package com.mx.curso.Unidad1.checkpoints.checkpoint2.contextualizacion4;

public class Main {
    public static void main(String[] args) {

        DetectorDeBordes bordes = new DetectorDeBordes();
        bordes.aplicar();

        ReductorDeRuido ruido = new ReductorDeRuido();
        ruido.aplicar();
    }
}
