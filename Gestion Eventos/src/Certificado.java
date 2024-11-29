import java.time.LocalDate;

public class Certificado {
    private String descripcion;
    private LocalDate fecha;

    public Certificado(String descripcion, LocalDate fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}