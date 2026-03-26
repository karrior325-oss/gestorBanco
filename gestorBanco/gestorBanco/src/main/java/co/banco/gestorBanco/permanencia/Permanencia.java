package co.banco.gestorBanco.permanencia;

import co.banco.gestorBanco.dto.Cuenta;

public class Permanencia {
    public void guardarCuenta(Cuenta cuenta) {
        System.out.println("Cuenta guardada:");
        System.out.println("Cliente: " + cuenta.getCliente().getNombre());
        System.out.println("Número Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}
