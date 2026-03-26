package co.banco.gestorBanco.dto;

public class CuentaAhorros extends Cuenta  {
    public CuentaAhorros(String numeroCuenta, double saldo, Cliente cliente) {
        super(numeroCuenta, saldo, cliente);
    }
}
