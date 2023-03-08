public class Diputado extends Legislador{

    public Diputado() {

    }

    public Diputado(String nombre, String apellidos, int edad, boolean casado, String provincia, String partido, int despacho) {
        super(nombre, apellidos, edad, casado, provincia, partido, despacho);
    }

    public String getCamaraEnQueTrabaja() {
        return "Trabajo en el congreso";
    }
}
