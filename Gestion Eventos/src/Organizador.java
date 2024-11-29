public class Organizador {
    private String nombre;
    private String contacto;

    // Constructor
    public Organizador(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

    // Método getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Método getter para contacto
    public String getContacto() {
        return contacto;
    }
}