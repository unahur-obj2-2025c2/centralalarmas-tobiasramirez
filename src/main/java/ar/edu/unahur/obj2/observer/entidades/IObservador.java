package ar.edu.unahur.obj2.observer.entidades;

import ar.edu.unahur.obj2.observer.alertas.Alerta;

public interface IObservador {
    void actualizar(Alerta alerta);
}
