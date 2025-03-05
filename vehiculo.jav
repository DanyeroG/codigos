public class Vehiculo {
    // Propiedades
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Método para obtener la marca
    public String getMarca() {
        return marca;
    }

    // Método para establecer la marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2020);
        System.out.println(vehiculo1.getMarca());
        vehiculo1.setMarca("Honda");
        System.out.println(vehiculo1.getMarca());
    }
}
