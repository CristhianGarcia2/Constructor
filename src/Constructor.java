public class Constructor {

    public static void main(String[] args) {
        Leon leon = new Leon("Simba", 5, "190kg", "Leon del Congo");
        Lobo lobo = new Lobo("Ghost", 4, "40kg", "Lobo Gris");
        Buho buho = new Buho("Archimedes", 2, "2kg", "Buho Real");


        System.out.println("Nombre del leon: " + leon.getNombre());
        System.out.println("Edad del leon: " + leon.getEdad() + " anos");

        System.out.println("Nombre del lobo: " + lobo.getNombre());
        System.out.println("Edad del lobo: " + lobo.getEdad() + " anos");

        System.out.println("Nombre del buho: " + buho.getNombre());
        System.out.println("Edad del buho: " + buho.getEdad() + " anos");
    }
}

