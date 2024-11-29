import java.util.ArrayList;

public class SistemaEventos {
    private ArrayList<Participante> participantes;

    // Constructor de SistemaEventos
    public SistemaEventos() {
        participantes = new ArrayList<>();
    }

    // Método para agregar un participante al sistema
    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

    // Método para mostrar los participantes registrados
    public void mostrarParticipantes() {
        for (Participante p : participantes) {
            System.out.println("Nombre: " + p.getNombre() + ", Email: " + p.getEmail());
        }
    }

    // Método para mostrar los ponentes registrados
    public void mostrarPonentes() {
        for (Participante p : participantes) {
            if (p instanceof Ponente) {
                Ponente ponente = (Ponente) p;
                System.out.println("Ponente: " + ponente.getNombre() + ", Tema: " + ponente.getTema());
            }
        }
    }
}