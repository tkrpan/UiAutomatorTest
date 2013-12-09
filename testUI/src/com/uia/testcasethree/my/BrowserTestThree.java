package com.uia.testcasethree.my;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class BrowserTestThree extends UiAutomatorTestCase {

	public void testCaseThree() throws UiObjectNotFoundException {

		getUiDevice().pressMenu();

		UiCollection menu = new UiCollection(
				new UiSelector().className("android.widget.FrameLayout"));

		UiObject saveToBookmarks = menu.getChildByText(
				new UiSelector().className("android.widget.LinearLayout"),
				"Save to bookmarks");
		saveToBookmarks.clickAndWaitForNewWindow();

		UiObject buttonOk = new UiObject(new UiSelector().text("OK").className(
				"android.widget.Button"));

		buttonOk.click();
	}
}