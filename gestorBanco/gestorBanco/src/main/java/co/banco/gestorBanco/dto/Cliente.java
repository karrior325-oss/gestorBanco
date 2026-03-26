package co.banco.gestorBanco.dto;

public class Cliente {
    private String identificacion;
    private String nombre;

    public Cliente(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }
}
