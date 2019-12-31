package io.henao.semillero.empresaVideoJuego;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class BombarderoB56Test {
    private BombarderoB56 bombarderoB56;
    private BombarderoB56 bombarderoB56A;

    private ArrayList<BombarderoB56> bombarderoB56ArrayList;

    @Before
    public void setup(){
        bombarderoB56 = new BombarderoB56(5, 3, 4, 5000, false, "Ametralladora");
        bombarderoB56A = new BombarderoB56(10, 3, 4, 5000, false, "Ametralladora");
    }

    @Test
    public void BombarderoB56AmetralladoraTest(){
        Assert.assertEquals("El ataque no ha sido el esperado", "Atacar con ametralladora: 'TRAAATRAATRAA'", bombarderoB56.LanzarAtaque("Ametralladora", 5, false));
    }

    @Test
    public void VariosBombarderosTest(){
        Assert.assertEquals("El ataque no ha sido el esperado", "Atacar con ametralladora: 'TRAAATRAATRAA'" + "Atacar con ametralladora: 'TRAAATRAATRAA'", bombarderoB56.LanzarAtaque("Ametralladora", 10, false) + bombarderoB56A.LanzarAtaque("Ametralladora", 10, false));
    }
}
