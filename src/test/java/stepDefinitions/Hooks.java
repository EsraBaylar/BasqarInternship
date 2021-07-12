package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import utilies.BaseWebDriver;
import utilies.ExcelData;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @After
    public void after(Scenario scenario) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

        if (scenario.isFailed()) {
            TakesScreenshot screenshot = (TakesScreenshot) BaseWebDriver.getDriver();
            File file = screenshot.getScreenshotAs(OutputType.FILE);

            try {
                FileHandler.copy(file, new File("screenshots/" + scenario.getId() + date.format(formatter) + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String path="src/test/java/resources/LoginData.xlsx";
            ExcelData.writeExcel(path,scenario,BaseWebDriver.browserName.get(),date.format(formatter));
        }
        BaseWebDriver.quitDriver();
    }
}