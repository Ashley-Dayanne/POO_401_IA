package com.mx.curso.pipeline.procesamiento;

private String nombreModelo;
private double precision;

public MotorIA(String nombre, double precision) {
    this.nombreModelo = nombre;
    this.precision = precision;
}

// Getter
public String getNombre() {
    return nombreModelo;
}

public double getPrecision() {
    return precision;
}

// Setter con validación
public void setPrecision(double precision) {
        if (precision >= 0.0 && precision <= 1.0) {
        this.precision = precision;
        } else {
        System.out.println("Error: la precisión debe estar entre 0.0 y 1.0");
        }
        }

// CONTRATO ABSTRACTO
public abstract void analizar(String texto);


// 2. IMPLEMENTACIÓN: Analizador de Sentimientos
class AnalizadorSentimientos extends MotorIA {

    public AnalizadorSentimientos() {
        super("Sentiment-BERT-Lite", 0.89);
    }

    @Override
    public void analizar(String texto) {

        System.out.println("Modelo usado: " + getNombre());
        System.out.println("Analizando texto: " + texto);

        // Simulación del procesamiento NLP
        String textoNormalizado = texto.toLowerCase();

        if (textoNormalizado.contains("feliz") ||
                textoNormalizado.contains("bueno") ||
                textoNormalizado.contains("excelente") ||
                textoNormalizado.contains("genial")) {

            System.out.println("Resultado: POSITIVO");

        } else {

            System.out.println("Resultado: NEGATIVO");
        }
    }
}


// 3. USO DEL SISTEMA
public class Main {

    public static void main(String[] args) {

        // El frontend solo usa el método analizar()
        MotorIA miModelo = new AnalizadorSentimientos();

        System.out.println("Sistema de análisis NLP iniciado\n");

        miModelo.analizar("Hoy es un día muy bueno y estoy feliz");

        System.out.println();

        miModelo.analizar("El servicio fue terrible");
    }
}
