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
        System.out.println("Escaneando entorno 360°... Generando nube de puntos láser." + " " + "Modelo:" + " " + getModelo() + " " + "Consumo de energía:" + " " + getConsumoEnergia());
    }

    private String getConsumoEnergia() {
    }
    private String getModelo() {
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
    private static Object consumoEnergia;

    public static void main(String[] args) {

        List<SensorIA> percepcionHD = new ArrayList<>();
        String modelo;


        SensorLidar obj1 = new SensorLidar(modelo: "1.1", consumoEnergia: 1.30);
       SensorLidar obj2 = new SensorLidar(modelo: "1.4", consumoEnergia: 2.65);
       SensorVision obj3 = new SensorVision(modelo: "1.23", consumoEnergia: 2.44);
       SensorVision obj4 = new SensorVision(modelo: "1.9", consumoEnergia: 2.01);
       SensorUltrasonido obj5 = new SensorUltrasonido(modelo: "1.43", consumoEnergia: 1.54);
       SensorUltrasonido obj6 = new SensorUltrasonido(modelo: "1.92", consumoEnergia: 1.26);

       percepcionHD.add(obj1);
       percepcionHD.add(obj2);
       percepcionHD.add(obj3);
       percepcionHD.add(obj4);
       percepcionHD.add(obj5);
       percepcionHD.add(obj6);


        for (SensorIA f : percepcionHD) {
            f.leerDatos();
        }
    }
}
