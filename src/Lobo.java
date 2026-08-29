public class Lobo extends Animales {

    public Lobo(String nombre, int edad, String peso, String raza) {
        super(nombre, edad, peso, raza);
    }

    public void aullar() {
        System.out.println(getNombre() + " dice: Auuuuu!");
    }
}