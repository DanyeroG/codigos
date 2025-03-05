<?php
class Empleado {
    // Propiedades
    private $nombre;
    private $posicion;
    private $salario;

    // Constructor
    public function __construct($nombre, $posicion, $salario) {
        $this->nombre = $nombre;
        $this->posicion = $posicion;
        $this->salario = $salario;
    }

    // Método para obtener el nombre
    public function getNombre() {
        return $this->nombre;
    }

    // Método para establecer el nombre
    public function setNombre($nombre) {
        $this->nombre = $nombre;
    }

    // Método para obtener la posición
    public function getPosicion() {
        return $this->posicion;
    }

    // Método para establecer la posición
    public function setPosicion($posicion) {
        $this->posicion = $posicion;
    }

    // Método para obtener el salario
    public function getSalario() {
        return $this->salario;
    }

    // Método para establecer el salario
    public function setSalario($salario) {
        $this->salario = $salario;
    }
}

// Ejemplo de uso
$empleado1 = new Empleado("Ana", "Desarrolladora", 50000);
echo $empleado1->getNombre();
$empleado1->setNombre("Lucía");
echo $empleado1->getNombre();
?>
