package figuras;

/**
 * Modela un círculo posicionado en un sistema de coordenadas cartesianas 2D.
 */
public class Circulo {
    // Variables de instancia privadas para asegurar el encapsulamiento
    private double x;
    private double y;
    private double radio;

    /**
     * Constructor por defecto: sitúa un círculo unitario en el origen (0, 0) con radio de 1.
     */
    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.radio = 1;
    }

    /**
     * Constructor que establece la posición en el eje X, fijando Y en 0 y radio en 1.
     */
    public Circulo(double x) {
        this.x = x;
        this.y = 0;
        this.radio = 1;
    }

    /**
     * Constructor que define las coordenadas cartesianas (X, Y) manteniendo el radio por defecto en 1.
     */
    public Circulo(double x, double y) {
        this.x = x;
        this.y = y;
        this.radio = 1;
    }

    /**
     * Constructor parametrizado para configurar completamente la posición y el radio del círculo.
     */
    public Circulo(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    /**
     * Obtiene el área total de la figura aplicando la fórmula (PI * r^2).
     */
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    /**
     * Obtiene el perímetro o circunferencia aplicando la fórmula (2 * PI * r).
     */
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    /**
     * Traslada la posición del círculo horizontalmente a lo largo del eje X.
     *
     * @param unidadesX Incremento o decremento a aplicar sobre la coordenada X.
     */
    public void moverX(double unidadesX) {
        this.x += unidadesX;
    }

    /**
     * Traslada la posición del círculo verticalmente a lo largo del eje Y.
     *
     * @param unidadesY Incremento o decremento a aplicar sobre la coordenada Y.
     */
    public void moverY(double unidadesY) {
        this.y += unidadesY;
    }

    /**
     * Modifica simultáneamente las coordenadas X e Y para desplazar el círculo en el plano.
     *
     * @param unidadesX Desplazamiento sobre el eje horizontal.
     * @param unidadesY Desplazamiento sobre el eje vertical.
     */
    public void moverXY(double unidadesX, double unidadesY) {
        this.x += unidadesX;
        this.y += unidadesY;
    }

    /**
     * Imprime por consola los valores actuales de posición y dimensión del círculo.
     */
    public void dibujar() {
        System.out.println("Círculo en posición -> X: " + this.x + ", Y: " + this.y + " | Radio: " + this.radio);
    }

    // Métodos de acceso y modificación (Getters y Setters)
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}