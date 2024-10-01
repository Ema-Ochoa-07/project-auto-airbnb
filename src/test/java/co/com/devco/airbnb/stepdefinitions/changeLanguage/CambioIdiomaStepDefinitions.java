package co.com.devco.airbnb.stepdefinitions.changeLanguage;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.page.changeLanguage.ActualizacionInglesAirBnbPage;
import co.com.devco.airbnb.task.changeLanguage.CambiarIdioma;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CambioIdiomaStepDefinitions {

    @Dado("(que ){actor} está navegando en Airbnb con la interfaz en español")
    public void cambiarIdiomaInglesEstadosUnidos(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().the(AirBnbHomePage.class)

        );
    }


    @Cuando("{actor} cambie el idioma de la interfaz a inglés")
    public void cambiarIdiomaIngles(Actor actor) {
        actor.attemptsTo(
                CambiarIdioma.a("English (United States)")
        );
    }

    @Entonces("{actor} debe poder observar que la página está en Inglés")
    public void verificarPaginaInglesEstadosUnidos(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ActualizacionInglesAirBnbPage.REFRESH_PAGE.resolveFor(actor).getText())
                        .isEqualTo("lugares en")
        );
    }
}
