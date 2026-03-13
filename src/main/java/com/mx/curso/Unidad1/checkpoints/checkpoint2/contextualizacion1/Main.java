package com.mx.curso.Unidad1.checkpoints.checkpoint2.contextualizacion1;

public class Main {
    public static void main(String[] args) {

        DatasetImagen imagen = new DatasetImagen();
        imagen.cargarDatos();
        imagen.cargarPixeles();

        DatasetTexto texto = new DatasetTexto();
        texto.cargarDatos();
        texto.cargarTokens();
    }
}
