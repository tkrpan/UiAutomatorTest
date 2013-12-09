package com.uia.testcase.my;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class BrowserTestOne extends UiAutomatorTestCase {
	
	public void testCaseOne() throws UiObjectNotFoundException {   
	      
	      getUiDevice().pressHome();
	      
	      UiObject allAppsButton = new UiObject(new UiSelector()
	         .description("Apps"));
	      
	      allAppsButton.clickAndWaitForNewWindow();

	      UiScrollable appView = new UiScrollable(new UiSelector()
	         .scrollable(true));
	       
	      UiObject browser = appView.getChildByText(new UiSelector()
	         .className(android.widget.TextView.class.getName()), "Browser");
	      browser.clickAndWaitForNewWindow();
	      
	      UiObject editText = new UiObject(new UiSelector()
			.className("android.widget.EditText"));
	      
	      editText.click();
	      editText.setText("http://fiveminutesstudio.com/");
	      getUiDevice().pressEnter();
	  }	
}
