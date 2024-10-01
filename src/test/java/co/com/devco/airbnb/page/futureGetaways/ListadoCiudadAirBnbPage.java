package co.com.devco.airbnb.page.futureGetaways;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com.co")
public class ListadoCiudadAirBnbPage extends PageObject {
    public static Target LISTADO_CIUDAD = Target.the("botón listado de estadís por ciudad").locatedBy("//span[@data-testid='stays-page-heading' and contains(text(), 'lugares en')]");


}