public class Vehiculo {
    public int num_bastidor;
    public double peso;

    public Vehiculo (int num_bastidor, double peso) {
        this.num_bastidor = num_bastidor;
        this.peso = peso;
    }

    public int getNum_bastidor() {
        return num_bastidor;
    }

    public void setNum_bastidor(int num_bastidor) {
        this.num_bastidor = num_bastidor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "num_bastidor=" + num_bastidor +
                ", peso=" + peso +
                '}';
    }

    public double impuestoBase() {
        return 0.45*peso;
    }
}
