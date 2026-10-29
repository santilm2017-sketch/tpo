package Relaciones.Asociacion;

public class ContratoAlquiler {
    private String numero;
    private int cantidadDias;
    private double costoPorDia;
    private boolean activo;

    public ContratoAlquiler(String numero, int cantidadDias, double costoPorDia, boolean activo) {
        this.numero = numero;
        this.cantidadDias = cantidadDias;
        this.costoPorDia = costoPorDia;
        this.activo = activo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public double getCostoPorDia() {
        return costoPorDia;
    }

    public void setCostoPorDia(double costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = true;
    }

    public double calcularImporte(int cantidadDias, double precioPorDia){
        double importe = cantidadDias * precioPorDia;
        return importe;
    }
    public double calcularImporte(int cantidadDias, double precioPorDia, double descuento){
        double importe = cantidadDias * precioPorDia;
        return importe*descuento;
    }

    public boolean finalizarContrato(){
        return activo = false;
    }
}
