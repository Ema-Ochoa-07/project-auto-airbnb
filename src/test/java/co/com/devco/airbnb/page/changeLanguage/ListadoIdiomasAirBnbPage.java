package co.com.devco.airbnb.page.changeLanguage;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com.co")
public class ListadoIdiomasAirBnbPage extends PageObject {
    public static Target ENGLISH_BOT = Target.the("botón idioma english unite state").locatedBy("//a[div[text()='English'] and div[text()='United States']]");

}