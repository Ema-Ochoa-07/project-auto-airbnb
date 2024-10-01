package co.com.devco.airbnb.task.changeLanguage;

import co.com.devco.airbnb.page.changeLanguage.CambiarIdiomaAirBnbPage;
import co.com.devco.airbnb.page.changeLanguage.ScrollEnglishUnitedStatesAirBnbPage;
import co.com.devco.airbnb.page.changeLanguage.ListadoIdiomasAirBnbPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class CambiarIdioma {
    public static Performable a(String idioma) {
        return Task.where("{0} cambia el idioma a " + idioma,
                Click.on(CambiarIdiomaAirBnbPage.MUNDO_BOT).afterWaitingUntilPresent(),
                Scroll.to(ScrollEnglishUnitedStatesAirBnbPage.SCROLL_ENGLISH),
                Click.on(ListadoIdiomasAirBnbPage.ENGLISH_BOT)
        );
    }
}
