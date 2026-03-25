package com.mx.curso.Unidad2.abstraccion;

import java.util.ArrayList;
import java.util.List;

abstract class SensorIA {
    protected String modelo;
    protected double consumoEnergia;

    public SensorIA(String modelo, double consumoEnergia) {
        this.modelo = modelo;
        this.consumoEnergia = consumoEnergia;
    }

    public abstract void leerDatos();
}

class SensorLidar extends SensorIA {

    public SensorLidar(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Escaneando entorno 360°... Generando nube de puntos láser.");
    }
}

class SensorVision extends SensorIA {

    public SensorVision(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Capturando frame... Ejecutando segmentación semántica de objetos.");
    }
}

class SensorUltrasonido extends SensorIA {

    public SensorUltrasonido(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Enviando pulso sónico... Midiendo tiempo de rebote para proximidad.");
    }
}


public class Main {
    public static void main(String[] args) {

        // Hub de percepción
        List<SensorIA> percepcionHub = new ArrayList<SensorIA>();

        // Agregar sensores
        percepcionHub.add(new SensorLidar("Lidar-X1", 15.5));
        percepcionHub.add(new SensorVision("Cam-HD", 10.2));
        percepcionHub.add(new SensorUltrasonido("UltraSound-Pro", 5.8));

        // Demostración de Polimorfismo
        System.out.println("=== Iniciando lectura de sensores ===");

        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos(); // Polimorfismo en acción
        }
    }
}
