package co.com.devco.airbnb.page.changeLanguage;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com.co")
public class ScrollEnglishUnitedStatesAirBnbPage extends PageObject {
    public static Target SCROLL_ENGLISH = Target.the("scroll idioma english unite state").locatedBy("//a[div[text()='English'] and div[text()='United States']]");

}