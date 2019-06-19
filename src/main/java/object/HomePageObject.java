package object;

//import java.util.ArrayList;
//import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]")
	private WebElement dress;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;

	@FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[1]")
	private WebElement nextpage;
	
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement womenpage;
	
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div/div[3]/p[7]/button[1]")
	private WebElement btntweet;
	
	
	@FindBy(id = "newsletter-input")
	private WebElement textboxletter;
	
	
	@FindBy(xpath = "//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	private WebElement btnbox;
	
	
	
	@FindBy(xpath ="//*[@id=\"columns\"]/p")
	private WebElement msgsuccess;
	
//	@FindBy(xpath ="short_description_content")
	//private WebElement msgsuccess;
	

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getwords() {
		return dress;

	}

	public WebElement getwomen() {
		return women;
	}

	public void clickbutton() {
		women.click();
	}

	public String getname() {
		return nextpage.getText();
	}
	
	public void womenbutton()
	{
   womenpage.click();
	}

	
	public WebElement gettweetbutton() {
		return btntweet ;
	}
	
	
	public void setNewsLetter(String email) {
		setText(textboxletter , email);
		btnbox.click();
	}
	public String getmsg() {
		return msgsuccess.getText();
	}
}
