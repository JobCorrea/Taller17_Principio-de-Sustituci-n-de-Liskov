public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(String titular, double saldo, double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Deposito en cuenta ahorros - Saldo actual: " + saldo);
    }

    @Override
    public void retirar(double monto) {
        saldo -= monto;
        System.out.println("Retiro en cuenta ahorros - Saldo actual: " + saldo);
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
        System.out.println("Interes aplicado - Saldo actual: " + saldo);
    }
}