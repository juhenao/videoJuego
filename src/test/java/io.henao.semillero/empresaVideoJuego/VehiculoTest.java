package io.henao.semillero.empresaVideoJuego;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VehiculoTest {
    private Vehiculo vehiculoBombarderoB56;
    private Vehiculo vehiculoCamionSumHi;

    @Before
    public void setup(){
        vehiculoBombarderoB56 = new Vehiculo(100, 2, 4, 500, false);
        vehiculoCamionSumHi = new Vehiculo(1000, 1, 2, 4500, false);
    }

    @Test
    public void sumaPersonasConvoy(){
        int personaBom = vehiculoBombarderoB56.getCapacidadPersona();
        int personaSum = vehiculoCamionSumHi.getCapacidadPersona();
        int totalPersona = personaBom + personaSum;
        Assert.assertEquals("La cantidad de personas por convoy no es la esperada", 6, totalPersona);
    }
}
