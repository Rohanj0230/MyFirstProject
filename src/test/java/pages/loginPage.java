package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='zgh-accounts']/child::a[@class='zgh-login']")
	WebElement sign_in;
	@FindBy(xpath = "//input[@id='login_id']")
	WebElement user_ID;
	@FindBy(xpath = "//button[@id='nextbtn']")
	WebElement NExt;
	@FindBy(id = "password")
	WebElement pass;

	public void sigin() {

		sign_in.click();
	}

	public void enterUser_Id(String username) {

		user_ID.sendKeys(username);
	}

	public void enterNextBtn() {
		NExt.click();
	}

	public void enterPassword(String Pas) {
		pass.sendKeys(Pas);
	}
}
