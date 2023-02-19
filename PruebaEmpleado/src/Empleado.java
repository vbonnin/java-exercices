public class Empleado {

//    Atributos
    private String dni;
    private String nombre;
    private  double salario;

//    Composicion
    private Nacionalidad nacionalidad;

    private static int numero = 0;

//    Metodos
    public Empleado() {
        numero++;
        nacionalidad = new Nacionalidad();

    }

    public Empleado(String dni, String nombre, double salario, Nacionalidad nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        numero++;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Empleado.numero = numero;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String toString() {
        return this.dni + ", " +this.nombre + ", " + this.salario+ ", " + this.nacionalidad.toString();
    }
}
