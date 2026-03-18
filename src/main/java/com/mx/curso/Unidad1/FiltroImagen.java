package com.mx.curso.Unidad1;

import java.util.ArrayList;
import java.util.List;

public class FiltroImagen {
    public void procesar() {
        String mensaje = "procesando imagen";
        System.out.println(mensaje);
    }
}package unidad1.pipelineprocesamiento;

class DectectorDeBordes extends FiltroImagen {
    @Override
    public void procesar() {
        System.out.print("procesando ");
        System.out.println("image");
    }
}package unidad1.pipelineprocesamiento;

class EscaladaDegrices extends FiltroImagen {
    @Override
    public void procesar() {
        final String TAREA = "procesando imagen";
        System.out.println(TAREA);
    }
}package unidad1.pipelineprocesamiento;

public class Main {
    public static void main(String[] args) {
        List<FiltroImagen> pipiline = new ArrayList<>();

        FiltroImagen r = new ReductorDeRuido();
        FiltroImagen r = new DectectorDeBordes();
        FiltroImagen r = new EscaladaDegrices();

        pipiline.add(r);
        pipiline.add(r);
        pipiline.add(r);

        for (FiltroImagen f : pipiline) {
            f.procesar();
        }
    }
}
