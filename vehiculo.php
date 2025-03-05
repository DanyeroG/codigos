<?php
class Vehiculo {
    // Propiedades
    private $marca;
    private $modelo;
    private $anio;

    // Constructor
    public function __construct($marca, $modelo, $anio) {
        $this->marca = $marca;
        $this->modelo = $modelo;
        $this->anio = $anio;
    }

    // Método para obtener la marca
    public function getMarca() {
        return $this->marca;
    }

    // Método para establecer la marca
    public function setMarca($marca) {
        $this->marca = $marca;
    }
}

// Ejemplo de uso
$vehiculo1 = new Vehiculo("Toyota", "Corolla", 2020);
echo $vehiculo1->getMarca();
$vehiculo1->setMarca("Honda");
echo $vehiculo1->getMarca();
?>
