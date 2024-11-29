public class Asistente extends Participante {

    private String tipoAsistencia;

    // Constructor
    public Asistente(String nombre, String email, String tipoAsistencia) {
        super(nombre, email);
        this.tipoAsistencia = tipoAsistencia;
    }

    // Getter para tipoAsistencia
    public String getTipoAsistencia() {
        return tipoAsistencia;
    }

    // Método para mostrar los detalles del asistente
    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre());  // Usando el getter para obtener el nombre
        System.out.println("Email: " + getEmail());
        System.out.println("Tipo de asistencia: " + tipoAsistencia);
    }
}