import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {

    WebDriver wd;

    @Test
    public void tableCss(){
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/olegnarushevich/QA_32_automation/QA32_StartSelenium/chromedriver");
        wd.manage().window();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app");
    }


    @Test
    public void homework(){
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/olegnarushevich/QA_32_automation/QA32_StartSelenium/chromedriver");
        wd.manage().window();
        wd.navigate().to("file:///Users/olegnarushevich/Downloads/index.html");


        WebElement item1 = wd.findElement(By.cssSelector("[href='#item1']"));
        WebElement item2 = wd.findElement(By.cssSelector("#nav ul li:nth-child(2)"));
        WebElement item3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement item4 = wd.findElement(By.cssSelector("#nav ul li:last-child"));

        WebElement inputName = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputSurename = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));
        WebElement sendButton = wd.findElement(By.cssSelector("#form1 button.btn"));

        WebElement eroupe = wd.findElement(By.cssSelector("#country-table tr:first-child td:first-child"));
        WebElement asia = wd.findElement(By.cssSelector("#country-table tr:first-child td:nth-child(2)"));
        WebElement  america = wd.findElement(By.cssSelector("#country-table tr:first-child td:last-child"));

        WebElement ukraine = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:first-child"));
        WebElement israel = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:nth-child(2)"));
        WebElement usa = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:last-child"));

        WebElement germany = wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:first-child"));
        WebElement russia = wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:nth-child(2)"));
        WebElement canada = wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:last-child"));

        WebElement poland = wd.findElement(By.cssSelector("#country-table tr:last-child td:first-child"));
        WebElement china = wd.findElement(By.cssSelector("#country-table tr:last-child td:nth-child(2)"));
        WebElement mexico = wd.findElement(By.cssSelector("#country-table tr:last-child td:last-child"));

        WebElement redSquare = wd.findElement(By.cssSelector("#alert p.message"));












    }
}
