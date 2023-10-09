import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class FlipkartFlightSearchSteps {

    private WebDriver driver;

    @Given("I navigate to flipkart.com")
    public void navigateToFlipkart() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
    }

    @When("I select round trip")
    public void selectRoundTrip() {
        WebElement roundTripOption = driver.findElement(By.xpath("//input[@value='ROUND_TRIP']"));
        roundTripOption.click();
    }

    @And("I select departure date")
    public void selectDepartureDate() {
        // Implement code to select departure date using Selenium
    }

    @And("I select return date")
    public void selectReturnDate() {
        // Implement code to select return date using Selenium
    }

    @And("I select departure location {string}")
    public void selectDepartureLocation(String fromLocation) {
        WebElement fromLocationInput = driver.findElement(By.id("fromLocation"));
        fromLocationInput.sendKeys(fromLocation);
    }

    @And("I select arrival location {string}")
    public void selectArrivalLocation(String toLocation) {
        WebElement toLocationInput = driver.findElement(By.id("toLocation"));
        toLocationInput.sendKeys(toLocation);
    }

    @And("I click on search")
    public void clickSearch() {
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();
    }

    @Then("I validate the total price for flights")
    public void validateTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement totalPriceElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("totalPrice")));

        // Implement code to validate the total price by comparing it with the sum of both flights' prices
        // You'll need to extract the flight prices and calculate the sum before comparing

        // Example code (you need to adapt this to your specific web elements):
        // String totalPriceText = totalPriceElement.getText();
        // double totalPrice = Double.parseDouble(totalPriceText.replaceAll("[^\\d.]", ""));
        // double sumOfFlightPrices = calculateSumOfFlightPrices();
        // assertEquals(sumOfFlightPrices, totalPrice, 0.01); // Use an appropriate tolerance
    }

    @And("I close the browser")
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
