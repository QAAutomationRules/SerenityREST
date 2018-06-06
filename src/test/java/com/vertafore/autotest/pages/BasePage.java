/**
 * The is the base page for all other Benefit Point pages.  It covers any common elements that are available on any
 * page as well as most of the supporting methods that might be used for things on any page.  This is done so that
 * all of the child pages can inherit the methods instead of having to implement them individually by page.
 *
 * @author      AJ Johnson
 * @author      Charlie Mitchell
 *
 * @version     1.0.0
 */

package com.vertafore.autotest.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.exceptions.SerenityManagedException;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class BasePage extends PageObject {

    // Selenium locators in the PageFactory pattern.  These are universal to all pages.
    @FindBy(css = "a[title=\"Google apps\"]")
    WebElementFacade appsLink;

    /**
     * Attempts to find an element that may not be present when an exception is not the desired outcome, for instance
     * when testing for the presence of something where the test should fail if it is not present or when using it
     * to help to wait for something to appear.
     *
     * @param by        The By locator for the element to be found
     *
     * @return          Returns the element if found, null if not
     */
    public WebElementFacade getElementThatMayNotBePresent(By by) {
        WebElementFacade element;
        try {
            element = find(by);
        } catch (NoSuchElementException e) {
            element = null;
        }

        return element;
    }

    /**
     * Attempts to find an element that may not be present when an exception is not the desired outcome, for instance
     * when testing for the presence of something where the test should fail if it is not present or when using it
     * to help to wait for something to appear.  This version goes off of an existing element instead of going after
     * the entire DOM.
     *
     * @param context   The element to look within
     * @param by        The By locator for the element to be found
     *
     * @return          Returns the element if found, null if not
     */
    public WebElementFacade getElementThatMayNotBePresent(WebElementFacade context, By by) {
        WebElementFacade element;
        try {
            element = context.findBy(by);
        } catch (NoSuchElementException e) {
            element = null;
        }

        return element;
    }

    /**
     * Navigates to a specific url.  Used at the beginning of all scenarios.
     *
     * @param url       Returns String of the url to be navigated to, requires full url
     */
    public void goToUrl(String url) {
        getDriver().get(url);
    }

    /**
     * Gets the current page's url from the browser.  This will use the browser window currently in focus.
     *
     * @return          Returns String of the url the browser is currently on
     */
    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    /**
     * Takes an element and gets the color associated with that element in the css as rgb.  It then converts that over
     * to hex using a helper method in Integer.
     *
     * @param element   Element to get the color from
     *
     * @return          Returns the hex value of the element's color
     */
    public String getElementColorAsHex(WebElementFacade element) {
        String rgbColor = element.getAttribute("color");
        String[] colorNumbers = rgbColor.replace("rgb(", "").replace(")", "").split(",");

        int r = Integer.parseInt(colorNumbers[0].trim());
        int g = Integer.parseInt(colorNumbers[1].trim());
        int b = Integer.parseInt(colorNumbers[2].trim());

        String hex = "" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);

        return hex;
    }

    /**
     * For use in entering a file location in the system dialog usually opened with trying to open or load a file.
     * Gets the absolute file path from a helper method, sets it to the clipboard, makes certain that the file
     * dialog is in focus either through Selenium or Sikuli depending on whether or not the system is Windows, and
     * then enters that value into the file location field and hits enter to submit it.
     *
     * @param location      The relative or absolute path to the file to be uploaded
     */
    public void systemDialogEnterFileLocation(String location) {

        StringSelection select = new StringSelection(location);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        if(System.getProperty("os.name").toLowerCase().contains("windows")) {
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_ALT);
            simpleSleep(1000);
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_ALT);
            simpleSleep(5000);
        } else {
            switchToMainWindow();
            switchToFirstPopUpWindow();
        }

        if(System.getProperty("os.name").toLowerCase().contains("mac")) {
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_META);

            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            simpleSleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } else {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
    }



    /**
     * Used to allow use of a sleep without always having to enter the try/catch block or throw the
     * InterruptedException.  Convenience method.
     *
     * @param millis    The time to be slept in milliseconds
     */
    public void simpleSleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    /**
     * Selenium identifies windows by something it calls a handle.  This gets the handle of the window currently in
     * focus.
     *
     * @return          Returns the String value of the window handle
     */
    private String getCurrentWindowHandle() {
        return getDriver().getWindowHandle();
    }

    /**
     * Takes the current handle and stores it in Serenity's persistent hashmap so that it can be come back to later.
     * It then gets the handle for the recent popup window and tells Selenium to switch focus to that window.  This is
     * generally used when the popup did not automatically gain focus.
     */
    public void switchToFirstPopUpWindow() {
        Serenity.getCurrentSession().put("mainHandle", getCurrentWindowHandle());

        String popUpHandle = null;
        Set<String> handles = getDriver().getWindowHandles();
        Iterator<String> iterator = handles.iterator();

        while(iterator.hasNext()) {
            popUpHandle = iterator.next();
        }

        getDriver().switchTo().window(popUpHandle);
    }

    /**
     * Gets the window handle for the main window from the Serenity hashmap and then switches to that window.
     */
    public void switchToMainWindow() {
        String mainHandle = (String) Serenity.getCurrentSession().get("mainHandle");
        getDriver().switchTo().window(mainHandle);
    }

    /**
     * This method is there when an element is present but not always immediately clickable.  This keeps trying for a
     * while before going ahead and throwing the normal exception if it could not throw correctly.
     *
     * @param element           Element to be clicked
     */
    public void retryClick(WebElementFacade element) {
        boolean clicked = false;
        for(int i = 0; i < 150; i++) {
            // Try clicking the selected element for 15 seconds
            try {
                element.click();
                clicked = true;
                break;
            } catch (SerenityManagedException e) {
                // Go ahead and swallow the exception here because the point is that this might not work the first time
            }

            simpleSleep(100);
        }

        // If it wasn't successfully clicked, go ahead and try this last time in order to get the exception
        if(!clicked) {
            element.click();
        }
    }
}
