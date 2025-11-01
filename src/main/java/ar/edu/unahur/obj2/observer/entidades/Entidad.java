package ar.edu.unahur.obj2.observer.entidades;

import java.util.List;

import ar.edu.unahur.obj2.observer.alertas.Alerta;
import ar.edu.unahur.obj2.observer.criterios.*;

public class Entidad implements IObservador {
    private final String nombre;
    private List<Alerta> alertasRecibidas;
    private Riesgo criterio = new Critico();
    @Override
    public void actualizar(Alerta alerta) {
        this.alertasRecibidas.add(alerta);
    }
    public Entidad(String nombre) {
        this.nombre = nombre;
    }
    public List<Alerta> getAlertasRecibidas() {
        return alertasRecibidas;
    }
    public Riesgo getCriterio() {
        return criterio;
    }
    public Double riesgo(){
        return criterio.obtenerRiesgo(this);
    }
    public void setCriterio(Riesgo criterio) {
        this.criterio = criterio;
    }
    
}
