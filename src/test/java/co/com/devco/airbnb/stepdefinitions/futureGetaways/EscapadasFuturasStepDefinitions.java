package co.com.devco.airbnb.stepdefinitions.futureGetaways;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.page.changeLanguage.ActualizacionInglesAirBnbPage;
import co.com.devco.airbnb.page.futureGetaways.ListadoCiudadAirBnbPage;
import co.com.devco.airbnb.task.changeLanguage.CambiarIdioma;
import co.com.devco.airbnb.task.futureGetaways.AgendarEscapadasFuturas;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

public class EscapadasFuturasStepDefinitions {


    @Dado("(que ){actor} busca una inspiración de escapada futura en Airbnb por {string} y {string}")
    public void seleccionarCiudad(Actor actor, String tipoEscapadas, String ciudad) {
        actor.attemptsTo(
                Open.browserOn().the(AirBnbHomePage.class)

        );
    }

    @Cuando("{actor} agende por llegada y por salida")
    public void agendarLlegadaSalida(Actor actor) {
        actor.attemptsTo(
                AgendarEscapadasFuturas.por("París", 10, 20)

        );
    }

    @Entonces("(A ){actor} deberá aparecerle lugares en París")
    public void verificarPaginaInglesEstadosUnidos(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ListadoCiudadAirBnbPage.LISTADO_CIUDAD.resolveFor(actor).getText())
                        .contains("lugares en")
        );
    }
}
