package ar.edu.unahur.obj2.observer.entidades;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unahur.obj2.observer.NivelDeAlertaIncorrectoException;
import ar.edu.unahur.obj2.observer.alertas.Alerta;

public class Central implements Observable {
    private Map<Alerta,Integer> registro = new HashMap<>();
    private Set<IObservador> entidades = new HashSet<>();
    private Alerta ultimaAlertaEmitida;
    public void emitirAlerta(String tipo, Integer nivel){
        if (nivel < 1 || nivel > 10){
            throw new NivelDeAlertaIncorrectoException();
        }
        Alerta alerta = new Alerta(tipo,nivel);
        this.registro.put(alerta,entidades.size());
        this.ultimaAlertaEmitida = alerta;
        this.notificar();
    }
    @Override
    public void notificar(){
        this.entidades.forEach(e->e.actualizar(this.ultimaAlertaEmitida));
    }
    @Override
    public void agregarObservador(IObservador observador) {
        this.entidades.add(observador);
    }
    @Override
    public void quitarObservador(IObservador observador) {
        this.entidades.remove(observador);
    }
    public Integer cantidadNotificacionesEnviadas(){
        return this.registro.values().stream().mapToInt(v->v.intValue()).sum();
    }
    
}
