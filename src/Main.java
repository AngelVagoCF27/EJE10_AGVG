import figuras.Circulo;

public class Main {
    public static void main(String[] args) {
        // Inicialización de tres objetos Circulo empleando diferentes constructores
        System.out.println("=== CREACIÓN DE CÍRCULOS ===");
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(3.0, 4.0);
        Circulo c3 = new Circulo(-2.5, 5.0, 4.5);

        // Representación en consola del estado inicial de cada instancia
        c1.dibujar();
        c2.dibujar();
        c3.dibujar();

        // Evaluación de las propiedades geométricas (área y perímetro)
        System.out.println("\n=== CÁLCULOS DE ÁREA Y PERÍMETRO ===");
        mostrarMetricas("Círculo 1", c1);
        mostrarMetricas("Círculo 2", c2);
        mostrarMetricas("Círculo 3", c3);

        // Desplazamiento de las figuras utilizando métodos de traslación
        System.out.println("\n=== TRASLACIÓN DE CÍRCULOS ===");
        c1.moverX(5.0);           // Desplaza 5 unidades sobre el eje X
        c2.moverY(-2.0);          // Desplaza -2 unidades sobre el eje Y
        c3.moverXY(2.5, -5.0);    // Modifica simultáneamente las coordenadas X y Y

        System.out.println("Nuevas posiciones tras el movimiento:");
        c1.dibujar();
        c2.dibujar();
        c3.dibujar();
    }

    // Función de apoyo para formatear e imprimir las métricas geométricas
    private static void mostrarMetricas(String nombre, Circulo c) {
        System.out.printf("%s -> Área: %.4f | Perímetro: %.4f%n",
                nombre, c.calcularArea(), c.calcularPerimetro());
    }
}