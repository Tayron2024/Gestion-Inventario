// 8. Clase Patrocinador (implementa ElementoAdicional)
class Patrocinador implements ElementoAdicional {
    private String nombre;
    private double monto;

    public Patrocinador(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    @Override
    public void asociar() {
        System.out.println("Patrocinador " + nombre + " ha sido asociado al evento.");
    }

    @Override
    public void desasociar() {
        System.out.println("Patrocinador " + nombre + " ha sido desasociado del evento.");
    }
}