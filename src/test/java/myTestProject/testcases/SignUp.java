package myTestProject.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.System.*;

public class SignUp {

    @Test
    public void SignUp1() throws InterruptedException {
        setProperty("webdriver.chrome.driver" ,"D:\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("https://curbside-front-end.herokuapp.com/sign-up");
        driver.manage().window().maximize();
        String title;
        title= driver.getTitle();
        out.println("Title of website is:"+title);
        WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div/div[1]/a/img"));
        if (logo.isDisplayed()){
            out.println("Logo is displayed: Pass");
        }
        driver.findElement(By.name("firstName")).sendKeys("Nabil");
        driver.findElement(By.name("lastName")).sendKeys("Muhammad");
        driver.findElement(By.name("credentials")).sendKeys("MD");
        driver.findElement(By.name("email")).sendKeys("nabeelshahid586+1@gmail.com");
        WebElement Pass1 = driver.findElement(By.name("password"));
        Pass1.sendKeys("12345@Tps");
        String Pass11 = Pass1.getAttribute("value");
        //System.out.println("first password:"+Pass11);
        WebElement Pass2 = driver.findElement(By.name("confirmPassword"));
        Pass2.sendKeys("12345@Tps");
        String Pass22 = Pass2.getAttribute("value");
        //System.out.println("second password:"+Pass22);
        if(Pass11.equals(Pass22)) {
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div/div/form/div/div/div[6]/button/span[1]/p")).click();
            System.out.println("SignUp Successful");
            Thread.sleep(2000);
            driver.close();
        }
        else{
            System.out.println("SignUp Unsuccessful");
            driver.close();
        }
    }



    @Test
    public void Login() throws InterruptedException {
        setProperty("webdriver.chrome.driver" ,"D:\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://curbside-front-end.herokuapp.com/login");

        driver.findElement(By.name("email")).sendKeys("nabeelshahid586@gmail.com");
        driver.findElement(By.className("MuiButton-label")).click();
        //driver.findElement(By.name("password")).sendKeys("12345@Tps");
        System.out.println("Unable yo Login");
        Thread.sleep(2000);
        driver.close();

    }

}
