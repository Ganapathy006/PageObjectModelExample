package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TimePageObject {

	@FindBy(id="menu_leave_viewLeaveModule")
	public static WebElement leavebutton;
	
	/*@FindBy(id="time_startingDays")
	public static WebElement firstdayofweek;
	*/
	
	@FindBy(id="leaveList_cmbSubunit")
	public static WebElement subUnit;
}
