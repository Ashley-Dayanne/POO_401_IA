package com.mx.curso.Unidad2.abstraccion;

import jdk.internal.vm.ThreadContainer;

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
    private static ThreadContainer percepcionHD;

    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<SensorIA>();

       SensorLidar obj1 = new SensorLidar();
       SensorLidar obj2 = new SensorLidar();
       SensorVision obj3 = new SensorVision();
       SensorVision obj4 = new SensorVision();
       SensorUltrasonido obj5 = new SensorUltrasonido();
       SensorUltrasonido obj6 = new SensorUltrasonido();

       percepcionHD.add(obj1);
       percepcionHD.add(obj2);
       percepcionHD.add(obj3);
       percepcionHD.add(obj4);
       percepcionHD.add(obj5);
       percepcionHD.add(obj6);


        for (SensorIA f : percepcionHub) {
            f.leerDatos();
        }
    }
}
