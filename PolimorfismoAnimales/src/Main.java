public class Main {
    public static void main(String[] args) {

        Animal miAnimal = new Gato();
        miAnimal.hacerSonido(5);
        miAnimal = new Perro();
        miAnimal.hacerSonido(2);
    }
}