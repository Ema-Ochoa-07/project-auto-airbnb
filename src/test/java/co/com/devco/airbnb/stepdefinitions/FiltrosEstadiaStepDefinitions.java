package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.task.Filtrar;
import co.com.devco.airbnb.task.AbrirTodosServiciosDetalle;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.Actor;

public class FiltrosEstadiaStepDefinitions {


    @Cuando("{actor} filtre por {string}")
    public void filtrar(Actor actor, String tipoFiltro) {
        actor.attemptsTo(
                Filtrar.por(tipoFiltro)
        );
    }
    @Entonces("{actor} ve que los {int} primeros resultados deben tener {string} en {string} en los servicios del detalle")
    public void validarServiciosDetalles(Actor actor, Integer cantidadValidar, String criterioValidar, String nombreApartadoServicio) {
        actor.attemptsTo(
                AbrirTodosServiciosDetalle.yValidarPara(cantidadValidar, criterioValidar, nombreApartadoServicio)

        );
    }
}
