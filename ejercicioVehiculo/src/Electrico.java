public class Electrico extends Vehiculo {
    private double precio;

    public Electrico( int num_bastidor, double peso, double precio) {
        super(num_bastidor, peso);
        this.precio= precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString()  + "Electrico{" + "precio=" + precio + '}';
    }

    public double impuestoBase() {
        return super.impuestoBase() + 0.09 * precio;
    }
}
