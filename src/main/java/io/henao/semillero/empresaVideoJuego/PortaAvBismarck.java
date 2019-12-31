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
        } else if(nombreArmamento == "Bomba"){
            if(!noMunicion){
                lanzandoAtaque = "APUNTEN...!! FUEGOOOOO!! ........ BOOM";
                numeroMunicion -= 1;
                if(numeroMunicion <= 0){
                    noMunicion = true;
                }
            }else{
                lanzandoAtaque = "SIN BOMBASSS, VAMONOS WEYYYYYYYYYYY!!!";
            }
        } else if(nombreArmamento == "Vengala"){
            if(!noMunicion){
                lanzandoAtaque = "Tuf tuf tuf tuf...";
                numeroMunicion -= 25;
                if(numeroMunicion <= 0){
                    noMunicion = true;
                }
            } else {
                lanzandoAtaque = "Viene un misíl, afuera todos!!!!";
            }
        } else if(nombreArmamento == "Misil autodirigido"){
            if(!noMunicion){
                lanzandoAtaque = "3...2...1... ~~ Pifsssssssss fhusssssssssssssssss BOOOOOOOOOOOOOOOOOOOOOOOOOOM";
                numeroMunicion -= 1;
                if(numeroMunicion <= 0){
                    noMunicion = true;
                }
            } else {
                lanzandoAtaque = "O.O ~ NO HAY MISILES??";
            }
        } else {
            lanzandoAtaque = "Este vehiculo no tiene equipadad el arma: " + nombreArmamento;
        }

        return lanzandoAtaque;
    }
}
