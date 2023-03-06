public class Informatico extends Empleado {
// Atributo
    private String lenguajeProgramacion;
// Constructor
    public Informatico(String dni, String nombre, double salario, Nacionalidad nacionalidad, String lenguajeProgramacion) {
        super(dni, nombre, salario, nacionalidad);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
//  Getter and seter
    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
// Tostring
    @Override
    public String toString() {
        return super.toString() + "Informatico{" +
                "lenguajeProgramacion='" + lenguajeProgramacion + '\'' +
                '}';
    }
// Metodo
    public void decirLenguajeDominante() {
        System.out.println("El lenguaje que domino es: " + lenguajeProgramacion);
    }

    public void incrementarSalario(double salario) {
        super.setSalario(super.getSalario() + 100 + salario);
    }
}
