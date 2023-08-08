package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class ExtraPage {
    public ExtraPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id="file-upload")
    public static WebElement uploadButton;
    @FindBy (id = "file-submit")
    public static WebElement submitButton;
    @ FindBy(id ="uploaded-files" )
    public static WebElement uploaded;
    @FindBy(xpath = "//a[contains(text(),'EmraBfPjPF.txt')]")
    public static WebElement fileForDownload;
}
