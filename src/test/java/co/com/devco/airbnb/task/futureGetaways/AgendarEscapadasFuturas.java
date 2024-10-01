package co.com.devco.airbnb.task.futureGetaways;

import co.com.devco.airbnb.page.DetalleServiciosLugarPage;
import co.com.devco.airbnb.page.futureGetaways.AlquilerVacacionalesAirBnbPage;
import co.com.devco.airbnb.page.futureGetaways.ListadoCiudadAirBnbPage;
import co.com.devco.airbnb.page.futureGetaways.ScrollInspiracionEscapadasFuturasBnbPage;
import co.com.devco.airbnb.page.futureGetaways.TiposEscapadasAirBnbPage;
import co.com.devco.airbnb.task.SeleccionarFechas;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.core.Serenity; // Importa esta clase para acceder a WebDriver
import org.openqa.selenium.WebDriver;
import java.util.Set;

public class AgendarEscapadasFuturas {
    public static Performable por(String localidad, Integer lleaga, Integer salida) {
        return Task.where("{0} buscar Escapadas futuras por "+ localidad+" "+lleaga +" "+ salida,
                //Scroll to the section
                Click.on(TiposEscapadasAirBnbPage.TIPO_ESCAPADA_BOT),
                Click.on(TiposEscapadasAirBnbPage.ESCAPADA_CIUDAD_BOT).afterWaitingUntilPresent(),
                Click.on(AlquilerVacacionalesAirBnbPage.PPAL_FECHAS_BOT),
                Click.on(AlquilerVacacionalesAirBnbPage.LLEGADA_BOT),
                Click.on(AlquilerVacacionalesAirBnbPage.SALIDA_BOT),
                // SeleccionarFechas.para(diasEstadia),
                Click.on(AlquilerVacacionalesAirBnbPage.BUSCAR_ESCAPADAS).afterWaitingUntilPresent(),

                // Cambiar el foco a la nueva pestaña
                Task.where("{0} cambia a la nueva pestaña",
                        actor -> {
                            WebDriver driver = Serenity.getDriver();
                            String ventanaOriginal = driver.getWindowHandle();

                            // Espera a que se abra la nueva pestaña y cambia el foco
                            Set<String> ventanas = driver.getWindowHandles();
                            for (String ventana : ventanas) {
                                if (!ventana.equals(ventanaOriginal)) {
                                    driver.switchTo().window(ventana);
                                    break;
                                }
                            }
                        }
                ),

                Click.on(ListadoCiudadAirBnbPage.LISTADO_CIUDAD)
        );
    }
}
