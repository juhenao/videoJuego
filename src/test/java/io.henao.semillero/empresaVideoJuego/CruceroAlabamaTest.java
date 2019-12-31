package io.henao.semillero.empresaVideoJuego;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CruceroAlabamaTest {
    private CruceroAlabama cruceroAlabama;

    @Before
    public void setup(){
        cruceroAlabama = new CruceroAlabama(5, 3, 4, 5000, false, "Ametralladora");
    }

    @Test
    public void TanqueM4AmetralladoraTest(){
        Assert.assertEquals("El ataque no ha sido el esperado", "Atacar con ametralladora: 'TRAAATRAATRAA'" + "APUNTEN...!! FUEGOOOOO!! ........ BOOM", cruceroAlabama.LanzarAtaque("Ametralladora", 5, false) + cruceroAlabama.LanzarAtaque("Bomba", 5, false));
    }
}
