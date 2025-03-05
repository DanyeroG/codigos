public class Empleado {
    // Propiedades
    private String nombre;
    private String posicion;
    private double salario;

    // Constructor
    public Empleado(String nombre, String posicion, double salario) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la posición
    public String getPosicion() {
        return posicion;
    }

    // Método para establecer la posición
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    // Método para obtener el salario
    public double getSalario() {
        return salario;
    }

    // Método para establecer el salario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana", "Desarrolladora", 50000);
        System.out.println(empleado1.getNombre());
        empleado1.setNombre("Lucía");
        System.out.println(empleado1.getNombre());
    }
}
