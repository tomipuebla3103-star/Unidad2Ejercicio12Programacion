public class Propiedad {
    String direccion;
    double tasacion;
    String estadoLegal;


    public Propiedad(String direccion, double tasacion, String estadoLegal) {
        this.direccion = direccion;
        this.tasacion = tasacion;
        this.estadoLegal = estadoLegal;

    }

    public void mostrarDatos() {
        System.out.println("Direccion: " + direccion);
        System.out.println("Tasacion: $" + tasacion);
        System.out.println("Estado legal: " + estadoLegal);
    }
}
