public class Ponente extends Participante {
    private String tema;

    // Constructor de Ponente
    public Ponente(String nombre, String email, String tema) {
        super(nombre, email);  // Llamada al constructor de Participante
        this.tema = tema;
    }

    // Método getter para obtener el tema del ponente
    public String getTema() {
        return tema;
    }

    // Sobrescribimos el método registrarse
    public void registrarse() {
        System.out.println(getNombre() + " se ha registrado como ponente, tema: " + tema);
    }
}