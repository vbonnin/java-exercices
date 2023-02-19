import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro("1", "Déjame que te cuente", "Jorge Bucay", 400);
        Libro l2 = new Libro("2", "La felicidad de los días tristes", "Pere Antoni Pons", 200);
        Libro l3 = new Libro("3", "Matilda", "Roald Dahl", 350);
        Libro[] libros = new Libro[3];

        libros[0] = l1;
        libros[1] = l2;
        libros[2] = l3;

        Libro mayorPaginas = l1;
        for (Libro l: libros) {
            System.out.println(l.toString());
            if (l.getPaginas() > mayorPaginas.getPaginas()) {
                mayorPaginas = l;
            }
        }
        System.out.println();
        System.out.println("El libro con más páginas: es " + mayorPaginas.getTitulo());


    }
}