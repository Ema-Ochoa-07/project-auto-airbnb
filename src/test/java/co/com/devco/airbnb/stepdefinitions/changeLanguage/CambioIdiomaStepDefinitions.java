package co.com.devco.airbnb.stepdefinitions.changeLanguage;

import co.com.devco.airbnb.page.changeLanguage.ActualizacionInglesAirBnbPage;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CambioIdiomaStepDefinitions {

    @Entonces("{actor} debe poder observar que la página está en inglés (Estados Unidos)")
    public void verificarPaginaInglesEstadosUnidos(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ActualizacionInglesAirBnbPage.REFRESH_PAGE.resolveFor(actor).getText())
                        .isEqualTo("English (United States)")
        );
    }
}
