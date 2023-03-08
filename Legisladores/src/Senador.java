public class Senador extends Legislador {

    public Senador() {

    }

    public Senador(String nombre, String apellidos, int edad, boolean casado, String provincia, String partido, int despacho) {
        super(nombre, apellidos, edad, casado, provincia, partido, despacho);
    }

    public String getCamaraEnQueTrabaja() {
        return "Trabajo en el senado";
    }
}
