package Relaciones.Asociacion.Herencia;

public class CuentaBancaria {
    protected String numeroCuenta;
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = 0;
    }

    public void depositar(double monto){
        saldo += monto;
    }
    public double extraer(double monto){
        if (saldo>0 && monto<=saldo){
            saldo -= monto;
            return saldo;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }
    public double calcularSaldoFinal(){
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
