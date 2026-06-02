public class Main {
    public static void main(String[] args) {
        // LSP: referencias de Figura sustituidas por Circulo y Rectangulo
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(8, 4);

        circulo.mostrarArea();
        rectangulo.mostrarArea();

        // Demostrando sustitucion sin alterar el programa
        System.out.println("\n--- Sustitucion LSP ---");
        Figura[] figuras = {new Circulo(3), new Rectangulo(6, 2)};
        for (Figura f : figuras) {
            f.mostrarArea();
        }
    }
}