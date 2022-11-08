public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setNombre(String newNombre){
        nombre = newNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int newEdad){
        edad = newEdad;
    }
    public int getEdad(){
        return edad;
    }
    public void setTelefono(String newTelefono){
        telefono = newTelefono;
    }
    public String getTelefono(){
        return telefono;
    }

}
