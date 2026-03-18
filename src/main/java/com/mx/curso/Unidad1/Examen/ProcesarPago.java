package com.mx.curso.Unidad1.Examen;

import java.util.ArrayList;
import java.util.List;

// ABSTRACCIÓN: Clase base que define el comportamiento general
abstract class MetodoPago {

    // ENCAPSULAMIENTO: atributo privado
    private double monto;

    // Constructor
    public MetodoPago(double monto) {
        this.monto = monto;
    }

    // Getter
    public double getMonto() {
        return monto;
    }

    // Método abstracto para obligar a las subclases a ejecutarlo
    public abstract void procesarPago();
}


// HERENCIA: Subclase para Pago con tarjeta
class PagoTarjeta extends MetodoPago {

    public PagoTarjeta(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        // POLIMORFISMO
        System.out.println("Procesando pago con Tarjeta por $" + getMonto());
    }
}


// HERENCIA: Seunda subclase para pagar con PayPal
class PagoPayPal extends MetodoPago {

    public PagoPayPal(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        // POLIMORFISMO
        System.out.println("Procesando pago con PayPal por $" + getMonto());
    }
}


// HERENCIA: última subclase para pagar con Cripto
class PagoCriptomoneda extends MetodoPago {

    public PagoCriptomoneda(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        // POLIMORFISMO
        System.out.println("Procesando pago con Criptomonedas por $" + getMonto());
    }
}


public class Main {
    public static void main(String[] args) {

        // POLIMORFISMO: lista tipo base
        List<MetodoPago> pipeline = new ArrayList<MetodoPago>();

        // Se crean diferentes tipos de pago pero todos se guardan como MetodoPago
        MetodoPago p1 = new PagoTarjeta(1000);
        MetodoPago p2 = new PagoPayPal(800);
        MetodoPago p3 = new PagoCriptomoneda(1500);

        // Se agregan a la lista
        pipeline.add(p1);
        pipeline.add(p2);
        pipeline.add(p3);

        // POLIMORFISMO: crear un sólo ciclo para ejecutar los métodos
        for (MetodoPago p : pipeline) {
            p.procesarPago();
        }
    }
}