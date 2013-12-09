package com.uia.testcasetwo.my;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class BrowserTestTwo extends UiAutomatorTestCase {

	public void testCaseTwo() throws UiObjectNotFoundException {

		getUiDevice().pressMenu();

		UiCollection menu = new UiCollection(
				new UiSelector().className("android.widget.FrameLayout"));

		UiObject find = menu.getChildByText(
				new UiSelector().className("android.widget.LinearLayout"),
				"Find on page");
		find.clickAndWaitForNewWindow();

		UiObject editText = new UiObject(new UiSelector().text("Find on page")
				.className("android.widget.EditText"));

		editText.setText("We love what we do");

		UiObject check = new UiObject(
				new UiSelector().className("android.widget.ImageView"));

		check.click();
	}
}