package ar.edu.unahur.obj2.observer.criterios;

import ar.edu.unahur.obj2.observer.entidades.Entidad;


public class Critico implements Riesgo {

    @Override
    public Double obtenerRiesgo(Entidad observador) {
        return observador.getAlertasRecibidas().getLast().esCritica() ? 10.0 : observador.getAlertasRecibidas().getLast().getNivel(); 
    }

}
