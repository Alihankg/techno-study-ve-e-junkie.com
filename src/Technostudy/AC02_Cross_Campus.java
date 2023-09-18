package Technostudy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AC02_Cross_Campus {
    @Test
    public void entrytoCampus() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        WebElement signIn = driver.findElement(By.linkText("SIGN IN"));
        signIn.click();

        String url = driver.getCurrentUrl();
        if (url.equals("https://campus.techno.study/")) {
            System.out.println("You have successfully logged in to the 'Campus' site.");
        } else {
            System.out.println("Sorry,but you are not logged.");
        }
        /* other options
        // sayfa bos mu dolu mu denetimi
        if (signIn != null) {
            System.out.println("Error");
        } else {
            System.out.println("Succesfully");
            //baslik denetimi
            String pageTitle = driver.getTitle();

            if (pageTitle.contains("Campus")) {
                System.out.println("Succefully");
            } else {
                System.out.println("Title was not displayed.");
            }
        }*/
    }
}

