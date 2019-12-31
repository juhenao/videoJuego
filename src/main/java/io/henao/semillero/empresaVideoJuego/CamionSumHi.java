package io.henao.semillero.empresaVideoJuego;

public class CamionSumHi extends Vehiculo implements LanzarAtaque{
    public CamionSumHi(int numeroMunicion, int cantidadArmamento, int capacidadPersona, double capacidadTransporteKg, boolean noMunicion, String nombreArmamento) {
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
                lanzandoAtaque = "Sin vengalas, retirada... viene un misíl!!!";
            }
        } else {
            lanzandoAtaque = "Este vehiculo no tiene equipadad el arma: " + nombreArmamento;
        }

        return lanzandoAtaque;
    }
}
