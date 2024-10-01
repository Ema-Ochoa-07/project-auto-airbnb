package co.com.devco.airbnb.page.futureGetaways;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com.co")
public class ScrollInspiracionEscapadasFuturasBnbPage extends PageObject {
    public static Target SCROLL_ESCAPADAS_FUTURAS = Target.the("scroll inspiraciones escapadas futuras").locatedBy("//h2[text()='Inspiración para escapadas futuras']");

}