package io.henao.semillero.empresaVideoJuego;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BombarderoB56Test {
    private BombarderoB56 bombarderoB56;

    @Before
    public void setup(){
        bombarderoB56 = new BombarderoB56(5, 3, 4, 5000, false, "Ametralladora");
    }

    @Test
    public void BombarderoB56AmetralladoraTest(){
        Assert.assertEquals("El ataque no ha sido el esperado", "Atacar con ametralladora: 'TRAAATRAATRAA'", bombarderoB56.LanzarAtaque("Ametralladora", 10, false));
    }
}
