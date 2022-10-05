package uia.com.menu;

public class Recordatorio {
    String nombreEvento;
    String fechaEvento;
    String fechaRecordatorio;
    String nombreContacto;

    public Recordatorio() {
    }

    public Recordatorio(String nombreEvento, String fechaEvento, String fechaRecordatorio, String nombreContacto) {
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.fechaRecordatorio = fechaRecordatorio;
        this.nombreContacto = nombreContacto;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public void setFechaRecordatorio(String fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }



}
