public class Main {
    public static void main(String[] args) {

        Nacionalidad n = new Nacionalidad(1, "España");
//        Empleado empleado1 = new Empleado();
//        Empleado empleado2 = new Empleado("123-X", "miguel", 1500, n);
//        System.out.println(empleado1.toString());
//        System.out.println(empleado2.toString());
//
//
//
//        empleado2.setDni("333-Y");
//        System.out.println(empleado2.getDni());
//        System.out.println(Empleado.getNumero());
//        System.out.println(empleado2.getNacionalidad().getNombre());

        Informatico i = new Informatico("111", "Miguel", 1000, n, "Java");
        Abogado a = new Abogado("223", "Pedro", 2000, n, 10);
        System.out.println(i.toString());
        i.incrementarSalario(200);
        System.out.println(i.getSalario());
        System.out.println(a.toString());
        a.incrementarSalario(200);
        System.out.println(a.getSalario());
    }
}