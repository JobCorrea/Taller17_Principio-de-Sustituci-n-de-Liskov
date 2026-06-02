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
        System.out.println();

        CuentaBancaria cuenta = new CuentaBancaria("Carlos", 500000);
        CuentaBancaria ahorros = new CuentaAhorros("Maria", 500000, 0.05);

        cuenta.depositar(100000);
        cuenta.retirar(50000);
        cuenta.mostrarSaldo();

        System.out.println();

        ahorros.depositar(100000);
        ahorros.retirar(50000);
        ahorros.mostrarSaldo();
    }
}