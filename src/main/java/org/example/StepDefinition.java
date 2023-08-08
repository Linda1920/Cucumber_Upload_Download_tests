package org.example;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import utilities.Driver;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.nio.file.Paths;
import java.io.IOException;

public class StepDefinition extends ExtraPage {



    @Given("user goes on the website to upload")
    public void user_goes_on_the_website_to_upload() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/upload");
    }
    @Given("user uploads the file")
    public void user_uploads_the_file() {
        String filePath="C:\\Users\\linda\\cucumberProject\\CucuberBDD\\src\\main\\resources\\EmraBfPjPF.txt";
        ExtraPage.uploadButton.sendKeys(filePath);
        ExtraPage.submitButton.click();
    }
    @Then("user checks result")
   public void user_checks_result() {
        Assert.isTrue(ExtraPage.uploaded.isDisplayed(), "File Uploaded!");
    }

 }

