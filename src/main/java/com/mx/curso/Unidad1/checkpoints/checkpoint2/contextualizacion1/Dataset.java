package com.mx.curso.Unidad1.checkpoints.checkpoint2.contextualizacion1;

class Dataset {
    public void cargarDatos() {
        System.out.println("Cargando datos del dataset...");
    }
}

class DatasetImagen extends Dataset {
    public void cargarPixeles() {
        System.out.println("Cargando pixeles de la imagen...");
    }
}

class DatasetTexto extends Dataset {
    public void cargarTokens() {
        System.out.println("Cargando tokens del texto...");
    }
}
