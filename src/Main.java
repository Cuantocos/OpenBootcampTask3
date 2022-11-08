public class Main {
    public static void main(String[] args) {
        Persona nuevaPersona = new Persona();
        nuevaPersona.setEdad(24);
        nuevaPersona.setNombre("Santiago");
        nuevaPersona.setTelefono("1135987462");

        System.out.println("El nombre es " + nuevaPersona.getNombre() + " su edad es " + nuevaPersona.getEdad() + " y su telefono es " + nuevaPersona.getTelefono());

    }
}