package ar.edu.unahur.obj2.observer.criterios;

import ar.edu.unahur.obj2.observer.entidades.Entidad;

public class Promedio implements Riesgo {

    @Override
    public Double obtenerRiesgo(Entidad obervador) {
       return obervador.getAlertasRecibidas().stream().mapToInt(a->a.getNivel()).average().orElse(0);
    }

}
