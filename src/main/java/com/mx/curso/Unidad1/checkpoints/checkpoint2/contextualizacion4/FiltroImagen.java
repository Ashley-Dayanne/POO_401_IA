package com.mx.curso.Unidad1.checkpoints.checkpoint2.contextualizacion4;

class FiltroImagen {
    public void aplicar() {
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
