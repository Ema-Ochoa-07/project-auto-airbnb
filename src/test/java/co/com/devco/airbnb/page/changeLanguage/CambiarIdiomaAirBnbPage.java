package co.com.devco.airbnb.page.changeLanguage;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com.co")
public class CambiarIdiomaAirBnbPage extends PageObject {
    public static Target MUNDO_BOT = Target.the("botón mundo").locatedBy("//div/button[@aria-label='Elige un idioma y una moneda']");

}