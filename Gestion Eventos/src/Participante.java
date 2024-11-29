public class Participante {
    private String nombre;
    private String email;

    // Constructor
    public Participante(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Método getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Métodos getters para email
    public String getEmail() {
        return email;
    }
}