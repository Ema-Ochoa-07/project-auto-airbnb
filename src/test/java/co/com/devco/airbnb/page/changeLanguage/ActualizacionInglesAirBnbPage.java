package co.com.devco.airbnb.page.changeLanguage;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com.co")
public class ActualizacionInglesAirBnbPage extends PageObject {
    public static Target REFRESH_PAGE = Target.the("página actualizada a idioma english").locatedBy("//div/span[@data-content='Stays' and text()='Stays']");

}