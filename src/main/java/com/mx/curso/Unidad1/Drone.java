package com.mx.curso.Unidad1;

import static com.mx.curso.Unidad1.Drone.*;
import static com.mx.curso.Unidad1.Drone.drone3;

class Drone {

    public static Drone drone1;
    public static Drone drone2;
    public static Drone drone3;
    String id;
    int bateria;

    // Constructor
    public Drone(String id, int bateria) {
        this.id = id;
        this.bateria = bateria;
    }
}

public class Main {
    public static void main(String[] args) {

        // Crear 3 drones diferentes
        drone1=new Drone("Drone-01", 100);
        drone2=new Drone("Drone-02", 100);
        drone3=new Drone("Drone-03", 100);
// Cambiar la batería de un solo drone
        drone1.bateria=50;

        // Mostrar el estado de cada drone
        System.out.println(drone1.id + " batería: " + drone1.bateria);
        System.out.println(drone2.id + " batería: " + drone2.bateria);
        System.out.println(drone3.id + " batería: " + drone3.bateria);
    }
}


