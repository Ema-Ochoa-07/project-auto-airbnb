package co.com.devco.airbnb.page.futureGetaways;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com.co")
public class AlquilerVacacionalesAirBnbPage extends PageObject {
    public static Target PPAL_FECHAS_BOT = Target.the("botón principal fechas").locatedBy("//div[@data-testid='date-range-picker']");
    public static Target LLEGADA_BOT = Target.the("botón dia llegada").locatedBy("//div[@data-testid='{0}']");
    public static Target SALIDA_BOT = Target.the("botón dia llegada").locatedBy("//div[@data-testid='{0}']");
    public static Target BUSCAR_ESCAPADAS = Target.the("botón buscar escapadas").locatedBy("//button//span[text()='Buscar']");


}