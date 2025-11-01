package ar.edu.unahur.obj2.observer.entidades;

public interface Observable {
    void agregarObservador(IObservador observador);
    void quitarObservador(IObservador observador);
    void notificar();
}
