package co.com.devco.airbnb.page.futureGetaways;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com.co")
public class TiposEscapadasAirBnbPage extends PageObject {
    public static Target TIPO_ESCAPADA_BOT = Target.the("botón arte y cultura").locatedBy("//button[@id='tab--seo-link-section-tabbed-dense-grid--1']");
    public static Target ESCAPADA_CIUDAD_BOT = Target.the("botón ciudad").locatedBy("//span[text()='París']");


}