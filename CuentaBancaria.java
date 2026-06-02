public class CuentaBancaria {
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Deposito exitoso - Saldo actual: " + saldo);
    }

    public void retirar(double monto) {
        saldo -= monto;
        System.out.println("Retiro exitoso - Saldo actual: " + saldo);
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " - Saldo: " + saldo);
    }
}