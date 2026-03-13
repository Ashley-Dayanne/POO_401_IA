package com.mx.curso.Unidad1.checkpoints.checkpoint2.contextualizacion2;

class AgenteIA {
    int energia = 100;

    public void moverse() {
        System.out.println("El agente se mueve.");
    }
}

class DronExplorador extends AgenteIA {

    @Override
    public void moverse() {
        System.out.println("El dron se mueve en coordenadas 3D.");
    }
}

class RobotTerrestre extends AgenteIA {

    @Override
    public void moverse() {
        System.out.println("El robot se mueve en un plano 2D.");
    }
}
