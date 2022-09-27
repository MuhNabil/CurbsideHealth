package myTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" ,"D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://curbside-front-end.herokuapp.com/login");
        driver.manage().window().maximize();
        /*String title;
        title= driver.getTitle();
        System.out.println("Title of website is:"+title);


        driver.findElement(By.name("firstName")).sendKeys("Nabil");
        driver.findElement(By.name("lastName")).sendKeys("Muhammad");
        driver.findElement(By.name("credentials")).sendKeys("MD");
        driver.findElement(By.name("email")).sendKeys("nabeelshahid586+1@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345@Tps");
        driver.findElement(By.name("confirmPassword")).sendKeys("12345@Tps");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div/div/form/div/div/div[6]/button/span[1]/p")).click();
        String text= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[1]/h3")).getText();
        if(text.contains("Get Started"))
            System.out.println("SignUp successful");*/

        driver.findElement(By.name("email")).sendKeys("nabeelshahid586+1@gmail.com");
        driver.findElement(By.className("MuiButton-label")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div/div/div/form/div[2]/div/div/div")).sendKeys("12345@Tps");
        Thread.sleep(20000);

    }
}
