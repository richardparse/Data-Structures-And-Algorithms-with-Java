package dataStructures;

public class LaunchingChrome {

	public static void main(String[] args) {
		String exePath = "C:\\Users\\abc\\Desktop\\Server\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-form/");	

	}

}
