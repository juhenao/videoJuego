package io.henao.semillero.empresaVideoJuego;

public class Vehiculo {
    private int numeroMunicion;
    private int cantidadArmamento;
    private int capacidadPersona;
    private double capacidadTransporteKg;
    private boolean noMunicion;

    public Vehiculo(int numeroMunicion, int cantidadArmamento, int capacidadPersona, double capacidadTransporteKg, boolean noMunicion){
        this.numeroMunicion = numeroMunicion;
        this.cantidadArmamento = cantidadArmamento;
        this.capacidadPersona = capacidadPersona;
        this.capacidadTransporteKg = capacidadTransporteKg;
        this.noMunicion = noMunicion;
    }

    public int getNumeroMunicion() {
        return numeroMunicion;
    }

    public void setNumeroMunicion(int numeroMunicion) {
        this.numeroMunicion = numeroMunicion;
    }

    public int getCantidadArmamento() {
        return cantidadArmamento;
    }

    public void setCantidadArmamento(int cantidadArmamento) {
        this.cantidadArmamento = cantidadArmamento;
    }

    public int getCapacidadPersona() {
        return capacidadPersona;
    }

    public void setCapacidadPersona(int capacidadPersona) {
        this.capacidadPersona = capacidadPersona;
    }

    public double getCapacidadTransporteKg() {
        return capacidadTransporteKg;
    }

    public void setCapacidadTransporteKg(double capacidadTransporteKg) {
        this.capacidadTransporteKg = capacidadTransporteKg;
    }

    public boolean isNoMunicion() {
        return noMunicion;
    }

    public void setNoMunicion(boolean noMunicion) {
        this.noMunicion = noMunicion;
    }
}
