class Persona:
    def __init__(self, nombre, edad, genero):
        self._nombre = nombre
        self._edad = edad
        self._genero = genero

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

# Ejemplo de uso
persona1 = Persona("Juan", 30, "Masculino")
print(persona1.get_nombre())
persona1.set_nombre("Carlos")
print(persona1.get_nombre())
