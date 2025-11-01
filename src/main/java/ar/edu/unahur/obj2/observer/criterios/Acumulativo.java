package ar.edu.unahur.obj2.observer.criterios;

import ar.edu.unahur.obj2.observer.entidades.Entidad;

public class Acumulativo implements Riesgo {

    @Override
    public Double obtenerRiesgo(Entidad obervador) {
       return obervador.getAlertasRecibidas().stream().filter(a->a.esCritica()).mapToDouble(a->a.getNivel()).sum();
    }

}
