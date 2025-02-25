<?php 

class persona {
  // propiedades 
   private $nombre;
  private $edad;
  private $genero;

// constructor
public function _construct($nombre, $edad, $genero) {
  $this->nombre = $nombre;
  $this->edad = $edad;
  $this->genero = $genero;
}
  // metodo para obtener el nombre 
public function getNombre () {
  return $this->nombre;
}
  //metodo para establecer el nombre
public function setNombre($nombre) {
  $this->nombre = $nombre;
}
