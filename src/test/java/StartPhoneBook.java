import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartPhoneBook {
    WebDriver wd;

    @Test
    public void startPhoneBook() {
        wd = new ChromeDriver();
//       /Users/olegnarushevich/QA_32_automation/QA32_StartSelenium/chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/olegnarushevich/QA_32_automation/QA32_StartSelenium/chromedriver");

        // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");//просто открывается страница без запоминаний
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");//открывается страница, а так же переходы назад-вперед(стрелочки)

        wd.manage().window().maximize();//открыть окно на максимуме

        //steps of test login success>>>
        //open login: find loginbtn+click --> opened form login
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        WebElement login = elements.get(2);
        login.click();

        //fill email: find email element + click + clear + type email
        //fill password:find password element + click + clear + type password
        //click login: find loginbtn element + click


        // wd.close();//закрытие одной закладки
        //wd.quit();//закрытие всех закладок
    }
       @Test
        public void home(){
            wd = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "/Users/olegnarushevich/QA_32_automation/QA32_StartSelenium/chromedriver");

            wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
           WebElement el = wd.findElement(By.tagName("html"));
            WebElement el1 = wd.findElement(By.tagName("head"));
            WebElement el2 = wd.findElement(By.tagName("body"));

            List<WebElement>elements = wd.findElements(By.tagName("meta"));
            List<WebElement>elements2 = wd.findElements(By.tagName("link"));
            List<WebElement> elements3 = wd.findElements(By.tagName("div"));
            List<WebElement>elements4 = wd.findElements(By.tagName("a"));
            List<WebElement>elements5 = wd.findElements(By.tagName("input"));
            List<WebElement>elements6 = wd.findElements(By.tagName("button"));


            WebElement el3 = wd.findElement(By.id("root"));
            WebElement el4 = wd.findElement(By.tagName("title"));
            WebElement el5 = wd.findElement(By.tagName("h1"));

            WebElement el6 = wd.findElement(By.className("container"));
            WebElement el7 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
            WebElement el8 = wd.findElement(By.className("active"));
            WebElement el9= wd.findElement(By.className("login_login__3EHKB"));
            WebElement el10= wd.findElement(By.name("viewport"));
            WebElement el11= wd.findElement(By.name("theme-color"));
            WebElement el12= wd.findElement(By.name("description"));

            WebElement el13 = wd.findElement(By.linkText("Home"));
            WebElement el14 = wd.findElement(By.partialLinkText("Ho"));//таким поисом почти никогда не пользуются

       }

       @Test
    public void cssLocatorsTest(){
           wd = new ChromeDriver();
           System.setProperty("webdriver.chrome.driver", "/Users/olegnarushevich/QA_32_automation/QA32_StartSelenium/chromedriver");
           wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");

           wd.findElement(By.cssSelector("div"));//by tag name

           wd.findElement(By.cssSelector(".login_login__3EHKB"));//точка впереди указывает на поиск by class

           wd.findElement(By.cssSelector("#root"));//  # - search by id

           wd.findElement((By.cssSelector("[placeholder='Password']")));//поиск по атрибуту
           wd.findElement((By.cssSelector("[placeholder=*'ss']")));
           wd.findElement((By.cssSelector("[placeholder=^'Pa']")));
           wd.findElement((By.cssSelector("[placeholder=^'Pa']")));

       }
    }
