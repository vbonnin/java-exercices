public class Main {
    public static void main(String[] args) {

        Senador s1= new Senador();
        System.out.println(s1);
        Senador s2= new Senador("Pepe", "Rodriguez", 28, false, "sevilla", "pp", 1);
        System.out.println(s2);
        Diputado d1= new Diputado();
        System.out.println(d1);
        Diputado d2= new Diputado("Raul", "Sanchez", 40, true, "Mallorca", "psoe", 2);
        System.out.println(d2);

        Legislador[] legisladores = {s1,s2,d1,d2};

        for (int i=0; i<legisladores.length; i++) {
            System.out.println(legisladores[i].getCamaraEnQueTrabaja());
        }
    }
}