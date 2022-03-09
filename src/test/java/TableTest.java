import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
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
    public void xPathTests(){
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/olegnarushevich/QA_32_automation/QA32_StartSelenium/chromedriver");
        wd.manage().window();
        wd.navigate().to("file:///Users/olegnarushevich/Downloads/index.html");

        WebElement item1 = wd.findElement(By.xpath("//a[@href='#item1']"));
        String textItem1 = item1.getText();
        Assert.assertEquals(textItem1, "Item 1");

        WebElement item2 = wd.findElement(By.xpath("//a[@href='#item2']"));
        String textItem2 = item2.getText();
        Assert.assertEquals(textItem2, "Item 2");

        WebElement item3 = wd.findElement(By.xpath("//a[@href='#item3']"));
        String textItem3 = item3.getText();
        Assert.assertEquals(textItem3, "Item 3");

        WebElement item4 = wd.findElement(By.xpath("//a[@href='#item4']"));
        String textItem4 = item4.getText();
        Assert.assertEquals(textItem4, "Item 4");

        WebElement inputName = wd.findElement(By.xpath("//*[@placeholder='Type your name']"));
        String textName = inputName.getText();
        Assert.assertEquals(textName, "");

        WebElement inputSurename = wd.findElement(By.xpath("//*[@placeholder='Type your surename']"));
        String textSurename = inputSurename.getText();
        Assert.assertEquals(textSurename, "");

        WebElement but = wd.findElement(By.xpath("//*[text()='Send']"));
        String textBut = but.getText();
        Assert.assertEquals(textBut, "SEND");

        WebElement europe = wd.findElement(By.xpath("//*[text()='Europe']"));
        String textEurope = europe.getText();
        Assert.assertEquals(textEurope, "Europe");

        WebElement asia = wd.findElement(By.xpath("//*[text()='Asia']"));
        String textAsia = asia.getText();
        Assert.assertEquals(textAsia, "Asia");

        WebElement america = wd.findElement(By.xpath("//*[text()='America']"));
        String textAmerica = america.getText();
        Assert.assertEquals(textAmerica, "America");

        WebElement ukraine = wd.findElement(By.xpath("//*[text()='Ukraine']"));
        String textUkraine = ukraine.getText();
        Assert.assertEquals(textUkraine, "Ukraine");

        WebElement israel = wd.findElement(By.xpath("//*[text()='Israel']"));
        String textIsrael = israel.getText();
        Assert.assertEquals(textIsrael, "Israel");

        WebElement usa = wd.findElement(By.xpath("//*[text()='USA']"));
        String textUsa = usa.getText();
        Assert.assertEquals(textUsa, "USA");

        WebElement germany = wd.findElement(By.xpath("//*[text()='Germany']"));
        String textGermany = germany.getText();
        Assert.assertEquals(textGermany, "Germany");

        WebElement russia = wd.findElement(By.xpath("//*[text()='Russia']"));
        String textRussia = russia.getText();
        Assert.assertEquals(textRussia, "Russia");

        WebElement canada = wd.findElement(By.xpath("//*[text()='Canada']"));
        String textCanada = canada.getText();
        Assert.assertEquals(textCanada, "Canada");

        WebElement poland = wd.findElement(By.xpath("//*[text()='Poland']"));
        String textPoland = poland.getText();
        Assert.assertEquals(textPoland, "Poland");

        WebElement chine = wd.findElement(By.xpath("//*[text()='Chine']"));
        String textChine = chine.getText();
        Assert.assertEquals(textChine, "Chine");

        WebElement mexico = wd.findElement(By.xpath("//*[text()='Mexico']"));
        String textMexico = mexico.getText();
        Assert.assertEquals(textMexico, "Mexico");

        item1.click();
        WebElement message = wd.findElement(By.xpath("//p[@class='message']"));
        String textMessage = message.getText();
        Assert.assertEquals(textMessage, "Clicked by Item 1");

        item2.click();
        WebElement message2 = wd.findElement(By.xpath("//p[@class='message']"));
        String textMessage2 = message2.getText();
        Assert.assertEquals(textMessage2, "Clicked by Item 2");

        item3.click();
        WebElement message3 = wd.findElement(By.xpath("//p[@class='message']"));
        String textMessage3 = message3.getText();
        Assert.assertEquals(textMessage3, "Clicked by Item 3");

        item4.click();
        WebElement message4 = wd.findElement(By.xpath("//p[@class='message']"));
        String textMessage4 = message4.getText();
        Assert.assertEquals(textMessage4, "Clicked by Item 4");

        but.click();
        WebElement messageSend = wd.findElement(By.xpath("//*[text()='NoName NoSurename']"));
        String textSend = messageSend.getText();
        Assert.assertEquals(textSend, "NoName NoSurename");
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
