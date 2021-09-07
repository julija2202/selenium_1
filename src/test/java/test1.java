import helps.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.Alert;

public class test1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getChromeDriver();
        driver.manage(). timeouts(). implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("juliet-ka@mail.ru");
        driver.findElement(By.name("session[password]")).sendKeys("2202");
        driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();
        driver.findElement(By.cssSelector("a[data-test='home']")).click();
        Thread.sleep(5000);


        //2 тест

        driver.findElement(By.cssSelector("a[href='/addresses']")).click();
        driver.findElement(By.cssSelector("a[href='/addresses/new']")).click();
        driver.findElement(By.id("address_first_name")).sendKeys("Julija");
        driver.findElement(By.id("address_last_name")).sendKeys("Yaholovich");
        driver.findElement(By.name("address[address1]")).sendKeys("Belarus");
        driver.findElement(By.name("address[address2]")).sendKeys("-");
        driver.findElement(By.name("address[city]")).sendKeys("Molodechno");
        driver.findElement(By.cssSelector("select[name='address[state]']")).click();
        driver.findElement(By.cssSelector("option[value='FL']")).click();
        driver.findElement(By.name("address[zip_code]")).sendKeys("123456789");
        driver.findElement(By.cssSelector("input[value='us']")).click();
        driver.findElement(By.name("address[birthday]")).sendKeys("22.02/1987");
        driver.findElement(By.name("address[color]")).sendKeys("#123456");
        driver.findElement(By.name("address[age]")).sendKeys("34");
        driver.findElement(By.name("address[website]")).sendKeys("https://proza.ru/");
        // driver.findElement(By.name("address[picture]")).sendKeys("786fc0798233006257d41dc0132f6387");
        driver.findElement(By.name("address[phone]")).sendKeys("1234567890");
        driver.findElement(By.cssSelector("input[id='address_interest_climb']")).click();
        driver.findElement(By.name("address[note]")).sendKeys("-");
        driver.findElement(By.cssSelector("input[name='commit']")).click();

        Thread.sleep(5000);

        //3 тест

        driver.findElement(By.cssSelector("a[href='/addresses']")).click();
        driver.findElement(By.xpath(".//a[text()='Edit']")).click();
        driver.findElement(By.name("address[address2]")).sendKeys("France");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(5000);

        //4 удаление

        driver.findElement(By.cssSelector("a[href='/addresses']")).click();
        driver.findElement(By.cssSelector(" body > div.container > table > tbody > tr:nth-child(1) > td:nth-child(7) > a")).click();
       // tr:first-child > td:nth-of-type(7)
        driver.switchTo().alert().accept();


        Thread.sleep(5000);

        //5 выход

        driver.findElement(By.cssSelector("a[href='/sign_out']")).click();

        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }
}
