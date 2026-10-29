package Relaciones.Asociacion;

public class Cliente {
    private String nombre;
    private int DNI;
    private ContratoAlquiler contrato;

    public Cliente(String nombre, int DNI, ContratoAlquiler contrato) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.contrato = contrato;
    }

    public Cliente(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public ContratoAlquiler getContrato() {
        return contrato;
    }

    public void setContrato(ContratoAlquiler contrato) {
        this.contrato = contrato;
    }
    public void asignarContrato(ContratoAlquiler contrato){
        this.contrato = contrato;
        return;
    }
    public boolean tieneContratoActivo(){
        return contrato.isActivo();
    }

    public String mostrarResumen() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", DNI=" + DNI +
                ", contrato=" + contrato +
                '}';
    }
}