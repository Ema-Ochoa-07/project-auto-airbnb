package co.com.devco.airbnb.stepdefinitions.changeLanguage;

import co.com.devco.airbnb.page.changeLanguage.ActualizacionInglesAirBnbPage;
import co.com.devco.airbnb.task.CambiarIdioma;
import co.com.devco.airbnb.task.Filtrar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CambioIdiomaStepDefinitions {


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
                        .isEqualTo("Stays")
        );
    }
}
