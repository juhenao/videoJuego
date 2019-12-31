package io.henao.semillero.empresaVideoJuego;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TanqueShM4Test {
    private TanqueShM4 tanqueShM4;

    @Before
    public void setup(){
        tanqueShM4 = new TanqueShM4(5, 3, 4, 5000, false, "Ametralladora");
    }

    @Test
    public void TanqueM4AmetralladoraTest(){
        Assert.assertEquals("El ataque no ha sido el esperado", "Atacar con ametralladora: 'TRAAATRAATRAA'", tanqueShM4.LanzarAtaque("Ametralladora", 5, false));
    }
}
