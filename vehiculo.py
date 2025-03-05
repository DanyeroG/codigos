class Vehiculo:
    def __init__(self, marca, modelo, anio):
        self._marca = marca
        self._modelo = modelo
        self._anio = anio

    def get_marca(self):
        return self._marca

    def set_marca(self, marca):
        self._marca = marca

# Ejemplo de uso
vehiculo1 = Vehiculo("Toyota", "Corolla", 2020)
print(vehiculo1.get_marca())
vehiculo1.set_marca("Honda")
print(vehiculo1.get_marca())
