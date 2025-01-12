import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openfacebook {

    @Test
    public void Facebooktest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        // Enter valid email and valid password
        driver.findElement(new By.ByName("email")).sendKeys("nadujay20@gmail.com");
        driver.findElement(new By.ByName("pass")).sendKeys("Nadu@2010");
        driver.findElement(new By.ByName("login")).click();
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


    @Test
    public void Facebooktest2() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        // Enter valid email and leave password field empty
        driver.findElement(new By.ByName("email")).sendKeys("nadujay20@gmail.com");
        driver.findElement(new By.ByName("pass")).sendKeys("");
        driver.findElement(new By.ByName("login")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    @Test
    public void Facebooktest3() {
        WebDriver driver = new ChromeDriver();


            driver.get("https://web.facebook.com/?_rdc=1&_rdr");
            // Enter incorrect email and valid password
            driver.findElement(new By.ByName("email")).sendKeys("nadu@gmail.com");
            driver.findElement(new By.ByName("pass")).sendKeys("Nadu@2010");
            driver.findElement(new By.ByName("login")).click();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            driver.quit();

    }


    @Test
    public void Facebooktest4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        // Leave both email and password fields empty and press Enter
        driver.findElement(new By.ByName("email")).sendKeys("");
        driver.findElement(new By.ByName("pass")).sendKeys("" + Keys.ENTER);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    @Test
    public void Facebooktest5() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        // Enter both incorrect email and password
        driver.findElement(new By.ByName("email")).sendKeys("nadu@gmail.com");
        driver.findElement(new By.ByName("pass")).sendKeys("Nadu@1" + Keys.ENTER);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    @Test
    public void Facebooktest6() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        //Caps Lock on for Password Field
        driver.findElement(new By.ByName("email")).sendKeys("nadujay20@gmail.com");
        driver.findElement(new By.ByName("pass")).sendKeys("NADU" + Keys.ENTER);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
    @Test
    public void Facebooktest7() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        // Enter an invalid email format
        driver.findElement(new By.ByName("email")).sendKeys("0774124585");
        driver.findElement(new By.ByName("pass")).sendKeys("Nadu@2010" + Keys.ENTER);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}