package com.solvd.practiceqa.web.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Footer extends AbstractUIObject {

    @FindBy(xpath = ".//li[contains(@class, 'legal')]")
    private List<ExtendedWebElement> privacyLinks;

    public Footer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public List<ExtendedWebElement> getPrivacyLinks() {
        return privacyLinks;
    }
}
