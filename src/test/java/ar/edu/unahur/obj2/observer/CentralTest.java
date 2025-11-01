package ar.edu.unahur.obj2.observer;

import ar.edu.unahur.obj2.observer.entidades.Central;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import ar.edu.unahur.obj2.observer.entidades.*;

public class CentralTest {
    private Central central;
    private Entidad e1;
    private Entidad e2;
    @BeforeEach
    void setUp(){
        central = new Central();
        e1 = new Entidad("Hospital");
        e2 = new Entidad("Bomberos");
        central.agregarObservador(e1);
        central.agregarObservador(e2);
    }
    @Test
    @DisplayName("dado el set up, alAgregarAlertas,SeVerificaCorrectamenteLasAlertasRecibidasYelRiesgo")
    void test1(){
        central.emitirAlerta("calor", 6);
        central.emitirAlerta(("lluvia"), 8);
        assertEquals("calor", e1.getAlertasRecibidas().getFirst().getTipo());
        assertEquals(6, e1.getAlertasRecibidas().getFirst().getNivel());
        assertEquals("lluvia", e1.getAlertasRecibidas().getLast().getTipo());
        assertEquals(8, e1.getAlertasRecibidas().getLast().getNivel());
    }
}
