public class Persona {
    // Propiedades
    private String nombre;
    private int edad;
    private String genero;

    // Constructor
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30, "Masculino");
        System.out.println(persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println(persona1.getNombre());
    }
}
