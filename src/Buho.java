public class Buho extends Animales {

    public Buho(String nombre, int edad, String peso, String raza) {
        super(nombre, edad, peso, raza);
    }

    public void ulular() {
        System.out.println(getNombre() + " dice: Huuu huuu!");
    }
}