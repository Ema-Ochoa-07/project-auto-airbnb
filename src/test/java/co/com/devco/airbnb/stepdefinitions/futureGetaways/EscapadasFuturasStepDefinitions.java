package co.com.devco.airbnb.stepdefinitions.futureGetaways;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.page.changeLanguage.ActualizacionInglesAirBnbPage;
import co.com.devco.airbnb.task.changeLanguage.CambiarIdioma;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

public class EscapadasFuturasStepDefinitions {


    @Dado("(que ){actor} busca una escapada futura en Airbnb por {string} y {string} ")
    public void seleccionarCiudad(Actor actor, String tipoEscapadas, String ciudad) {
        actor.attemptsTo(
                Open.browserOn().the(AirBnbHomePage.class)

        );
    }

    @Cuando("{actor} agende la {int} y {int}")
    public void agendarLlegadaSalida(Actor actor, Integer llegada, Integer salida) {
        actor.attemptsTo(
                angendar.la(llegada, salida)
        );
    }

    @Entonces("(A ){actor} deberá aparecerle lugares en París")
    public void verificarPaginaInglesEstadosUnidos(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ListadoLugaresPorCiudad.REFRESH_PAGE.resolveFor(actor).getText())
                        .isEqualTo("Stays")
        );
    }
}
