package co.banco.gestorBanco.dto;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(String numeroCuenta, double saldo, Cliente cliente) {
        super(numeroCuenta, saldo, cliente);
    }
}
