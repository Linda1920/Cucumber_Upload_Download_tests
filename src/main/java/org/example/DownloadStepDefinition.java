package org.example;
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
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.Assertion;
import utilities.Driver;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.nio.file.Paths;
import java.io.IOException;
public class DownloadStepDefinition extends ExtraPage {
    @Given("user goes on the download page")
    public void user_goes_on_the_download_page() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/download");
        //  throw new io.cucumber.java.PendingException();
    }
    @Given("user downloads the particular file")
    public void user_downloads_the_particular_file() {
        ExtraPage.fileForDownload.click();

        // throw new io.cucumber.java.PendingException();
    }
    @Then("user checks result after download")
    public void user_checks_result_after_download() {
        String filePath="C:\\Users\\linda\\cucumberProject\\CucuberBDD\\src\\main\\resources\\EmraBfPjPF.txt";
       // Path expectedPath = Paths.get(filePath);
        Assert.assertTrue(Files.exists(Paths.get(filePath)));
}}
