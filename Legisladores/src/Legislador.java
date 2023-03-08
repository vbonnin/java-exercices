public abstract class Legislador extends Persona {

    private String provincia;
    private String partido;
    private int despacho;

    public Legislador() {
        this.provincia = "";
        this.partido = "";
    }

    public Legislador(String nombre, String apellidos, int edad, boolean casado, String provincia, String partido, int despacho) {
        super(nombre, apellidos, edad, casado);
        this.provincia = provincia;
        this.partido=partido;
        this.despacho=despacho;
    }
    public abstract String getCamaraEnQueTrabaja();

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia=provincia;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Legislador{" +
                "provincia='" + provincia + '\'' +
                ", partido='" + partido + '\'' +
                ", despacho=" + despacho +
                '}';
    }
}
