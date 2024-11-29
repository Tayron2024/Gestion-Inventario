import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear un organizador
        Organizador organizador = new Organizador("Carlos Rodríguez", "carlos@ejemplo.com");

        // Crear una sala
        Sala sala = new Sala("Auditorio Principal", 200);

        // Crear un evento
        Evento evento = new Evento("Conferencia de Tecnología", LocalDate.of(2024, 12, 15), sala, organizador);

        // Crear participantes y ponentes
        Participante participante1 = new Participante("Juan Pérez", "juan@example.com");
        Ponente ponente1 = new Ponente("Ana Gómez", "ana@example.com", "La importancia de la tecnología");

        // Agregar participantes al evento
        evento.agregarParticipante(participante1);
        evento.agregarParticipante(ponente1);

        // Mostrar detalles del evento
        evento.mostrarDetalles();
    }
}