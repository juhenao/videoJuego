package io.henao.semillero.empresaVideoJuego;

public class PortaAvBismarck extends Vehiculo implements LanzarAtaque{
    public PortaAvBismarck(int numeroMunicion, int cantidadArmamento, int capacidadPersona, double capacidadTransporteKg, boolean noMunicion, String nombreArmamento) {
        super(numeroMunicion, cantidadArmamento, capacidadPersona, capacidadTransporteKg, noMunicion, nombreArmamento);
    }

    public String LanzarAtaque(String nombreArmamento, int numeroMunicion, boolean noMunicion) {
        String lanzandoAtaque = "";
        if(nombreArmamento == "Ametralladora"){
            if(!noMunicion){
                lanzandoAtaque = "Atacar con ametralladora: 'TRAAATRAATRAA'";
                numeroMunicion -= 3;
                if(numeroMunicion <= 0){
                    noMunicion = true;
                }
            } else {
                noMunicion = true;
                lanzandoAtaque = "CAPITAN, SIN MUNICIÓN!!!";

            }
        }

        return lanzandoAtaque;
    }
}
