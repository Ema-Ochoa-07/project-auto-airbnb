# language: es

Característica: Filtros en Airbnb de estadias

  Escenario: Filtrar por Piscinas increíbles
    Dado que Carlos busca un airbnb para "jardin, antioquia", por 5 días y para 2 "Adultos"
    Cuando Carlos filtre por "Piscinas increíbles"
    Entonces Carlos ve que los 1 primeros resultados deben tener "Piscina" en "Estacionamiento e instalaciones" en los servicios del detalle
