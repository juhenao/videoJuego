package io.henao.semillero.empresaVideoJuego;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PortaAvBismarckTest {
    private PortaAvBismarck portaAvBismarck;
    private PortaAvBismarck portaAvBismarckA;

    @Before
    public void setup(){
        portaAvBismarck = new PortaAvBismarck(5, 3, 4, 5000, false, "Misil autodirigido");
        portaAvBismarckA = new PortaAvBismarck(300, 3, 4, 5000, false, "Vengala");
    }

    @Test
    public void MisilAutodirigidoTest(){
        Assert.assertEquals("El ataque no ha sido el esperado", "3...2...1... ~~ Pifsssssssss fhusssssssssssssssss BOOOOOOOOOOOOOOOOOOOOOOOOOOM", portaAvBismarck.LanzarAtaque("Misil autodirigido", 5, false));
    }

    @Test
    public void VengalasTest(){
        Assert.assertEquals("El ataque no ha sido el esperado", "Tuf tuf tuf tuf...", portaAvBismarckA.LanzarAtaque("Vengala", 300, false));
    }
}
