public class Main {
    public static void main(String[] args) {
        Electrico e1 = new Electrico(111, 800, 30000);
        Electrico e2 = new Electrico(222,850,35000);
        Combustion c1 = new Combustion(333,900, 200);
        Combustion c2 = new Combustion(444,800,90);

        System.out.println(e1.toString() + " Impuesto: " +  e1.impuestoBase());
        System.out.println(e2.toString() + " Impuesto: " +  e2.impuestoBase());
        System.out.println(c1.toString() + " Impuesto: " +  c1.impuestoBase());
        System.out.println(c2.toString() + " Impuesto: " +  c2.impuestoBase());


    }
}