package animales;

public class Main {
    public static void main(String[] args){
        Animal animal1 = new Gato();
        Animal animal2 = new Perro();
        Animal animal3 = new Animal();
        animal1.hacerSonido(3);
        animal2.hacerSonido(5);
        animal3.hacerSonido(6);
    }
    
}
