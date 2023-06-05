package day01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String actualTitle = driver.getTitle();
        System.out.println("title = " + actualTitle);
        String actualUrl = driver.getCurrentUrl();
        System.out.println("url = " + actualUrl);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (actualTitle.contains("Teknoloji")){
            System.out.println("Teknoloji içeriyor = " + "Test PASSED");
        }else System.out.println("Teknoloji içermiyor =  + Test FAILED");

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (actualUrl.contains("teknosa")){
            System.out.println("teknosa içeriyor = " + "Test PASSED");
        }else System.out.println("teknosa içermiyor =  + Test FAILED");

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnaTitie = driver.getTitle();
        System.out.println("medunnaTitie = " + medunnaTitie);
        String medunnaUrl = driver.getCurrentUrl();
        System.out.println("medunnaUrl = " + medunnaUrl);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (medunnaTitie.contains("MEDUNNA")){
            System.out.println("MEDUNNA içeriyor = " + "Test PASSED");
        }else System.out.println("MEDUNNA içermiyor =  + Test FAILED");

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (medunnaUrl.contains("medunna")){
            System.out.println("medunna içeriyor = " + "Test PASSED");
        }else System.out.println("medunna içermiyor =  + Test FAILED");

        // teknosa adresine geri donunuz
        driver.navigate().back();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();
    }
}
