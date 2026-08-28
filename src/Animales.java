public class Animales {
    private String nombre;
    private int edad;
    private String peso;
    private String raza;

    public Animales(String nombre, int edad, String peso, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPeso() {
        return peso;
    }

    public String getRaza() {
        return raza;
    }
}
