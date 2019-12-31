package io.henao.semillero.empresaVideoJuego;

public class MotoHarley extends Vehiculo implements LanzarAtaque{
    public MotoHarley(int numeroMunicion, int cantidadArmamento, int capacidadPersona, double capacidadTransporteKg, boolean noMunicion, String nombreArmamento) {
        super(numeroMunicion, cantidadArmamento, capacidadPersona, capacidadTransporteKg, noMunicion, nombreArmamento);
    }

    public String LanzarAtaque(String nombreArmamento, int numeroMunicion, boolean noMunicion) {
        String lanzandoAtaque = "";
        if(nombreArmamento == "Vengala"){
            if(!noMunicion){
                lanzandoAtaque = "Tuf tuf tuf tuf...";
                numeroMunicion -= 25;
                if(numeroMunicion <= 0){
                    noMunicion = true;
                }
            } else {
                lanzandoAtaque = "Sin vengalas!! repito Sin vengalas!!";
            }
        } else {
            lanzandoAtaque = "Este vehiculo no tiene equipadad el arma: " + nombreArmamento;
        }

        return lanzandoAtaque;
    }
}
