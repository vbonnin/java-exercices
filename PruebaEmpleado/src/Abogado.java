public class Abogado extends Empleado {
    private int numeroColegiado;

    public Abogado (String dni, String nombre, double salario, Nacionalidad nacionalidad, int numeroColegiado) {
        super(dni, nombre, salario, nacionalidad);
        this.numeroColegiado = numeroColegiado;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numero) {
        this.numeroColegiado = numeroColegiado;
    }

    @Override
    public String toString() {
        return super.toString() + "Abogado{" +
                "numero colegiado=" + numeroColegiado +
                '}';
    }
}
