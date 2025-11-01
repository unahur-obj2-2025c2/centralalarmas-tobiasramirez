package ar.edu.unahur.obj2.observer.alertas;

public class Alerta {
    private final String tipo;
    private final Integer nivel;
    public Boolean esCritica(){
        return this.nivel >= 8;
    }
    public Alerta(String tipo, Integer nivel) {
        this.tipo = tipo;
        this.nivel = nivel;
    }
    public String getTipo() {
        return tipo;
    }
    public Integer getNivel() {
        return nivel;
    }
    

}
