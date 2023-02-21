# language: es
Característica: Hospedaje

  Escenario: Buscar un paquete con vuelo y hospedaje
    Cuando "Juliana" busca un paquete de viaje desde "Medellín" para "Bogotá"
    Entonces debe encontrar al menos una opción con valor menor a "500"
