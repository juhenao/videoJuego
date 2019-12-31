package io.henao.semillero.empresaVideoJuego;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VehiculoTest {
    private Vehiculo vehiculoBombarderoB56;
    private Vehiculo vehiculoCamionSumHi;

    private Vehiculo vehiculoPortaAviones;
    private Vehiculo vehiculoTanqueM4;

    @Before
    public void setup(){
        vehiculoBombarderoB56 = new Vehiculo(100, 2, 4, 500, false, null);
        vehiculoCamionSumHi = new Vehiculo(1000, 1, 2, 4500, false, null);

        vehiculoPortaAviones = new Vehiculo(100000000, 4, 3200, 97000000, false, null);
        vehiculoTanqueM4 = new Vehiculo(500, 2, 3, 7000, false, null);
    }

    @Test
    public void sumaPersonasConvoy(){
        int personaBom = vehiculoBombarderoB56.getCapacidadPersona();
        int personaSum = vehiculoCamionSumHi.getCapacidadPersona();
        int totalPersona = personaBom + personaSum;
        Assert.assertEquals("La cantidad de personas por convoy no es la esperada", 6, totalPersona);
    }

    @Test
    public void sumaCapacidadTransporte(){
        double capacidadPav = vehiculoPortaAviones.getCapacidadTransporteKg();
        double capacidadTanque = vehiculoTanqueM4.getCapacidadTransporteKg();
        double sumaCapacidad = capacidadPav + capacidadTanque;
        Assert.assertEquals("La suma de la capacidad no es la esperada", 97007000, sumaCapacidad, 0);
    }
}
