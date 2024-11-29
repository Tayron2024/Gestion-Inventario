import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private Sala lugar;
    private Organizador organizador;
    private ArrayList<Participante> participantes;

    // Constructor modificado para aceptar LocalDate y otros objetos
    public Evento(String nombre, LocalDate fecha, Sala lugar, Organizador organizador) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.organizador = organizador;
        this.participantes = new ArrayList<>();
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Sala getLugar() {
        return lugar;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    // Método para agregar un participante
    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

    // Mostrar los detalles del evento
    public void mostrarDetalles() {
        System.out.println("Evento: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Lugar: " + lugar.getNombre());  // Asumimos que 'Sala' tiene un método 'getNombre'
        System.out.println("Organizador: " + organizador.getNombre());
    }
}