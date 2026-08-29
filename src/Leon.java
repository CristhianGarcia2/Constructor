public class Leon extends Animales {

    public Leon(String nombre, int edad, String peso, String raza) {
        super(nombre, edad, peso, raza);
    }

    public void rugir() {
        System.out.println(getNombre() + " dice: Roar ");
    }
}