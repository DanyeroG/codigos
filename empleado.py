class Empleado:
    def __init__(self, nombre, posicion, salario):
        self._nombre = nombre
        self._posicion = posicion
        self._salario = salario

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

    def get_posicion(self):
        return self._posicion

    def set_posicion(self, posicion):
        self._posicion = posicion

    def get_salario(self):
        return self._salario

    def set_salario(self, salario):
        self._salario = salario

# Ejemplo de uso
empleado1 = Empleado("Ana", "Desarrolladora", 50000)
print(empleado1.get_nombre())
empleado1.set_nombre("Lucía")
print(empleado1.get_nombre())
