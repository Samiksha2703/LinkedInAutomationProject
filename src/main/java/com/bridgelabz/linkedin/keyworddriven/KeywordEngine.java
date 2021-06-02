/**
 * Description : KeywordEngine.java is file which is having code for keyword drive concept implementation.
 * Author      : Samiksha Shende
 * Date        : 30/05/2021
 */

package com.bridgelabz.linkedin.keyworddriven;

import com.bridgelabz.linkedin.utility.Constant;
import com.bridgelabz.linkedin.utility.ReadExcelFile;
import org.openqa.selenium.WebDriver;

import java.util.LinkedList;

public class KeywordEngine {
    public WebDriver driver1;
    public static LinkedList<String> keywordArraylist = new LinkedList<>();

    public LinkedList<String> testData() {
        ReadExcelFile rf = new ReadExcelFile(Constant.filePath);
        int rows = rf.getRowCount(0);
         for (int i = 0; i < rows; i++) {
            String data = rf.getData("Sheet1", i, 4);
            keywordArraylist.add(data);
        }
        System.out.println("Keywords " + keywordArraylist);
        return keywordArraylist;
    }

    public void performActions(LinkedList<String> testData){

        KeywordAction action = new KeywordAction();
        for (int index = 0; index < testData.size(); index++) {
            if ("openBrowser".equals(testData.get(index))) {
                driver1 = action.openBrowser();
            } else if ("navigate".equals(testData.get(index))) {
                action.navigate(driver1);
            } else if ("enterEmail".equals(testData.get(index))) {
                action.enterEmail(driver1);
            } else if ("enterPassword".equals(testData.get(index))) {
                action.enterPassword(driver1);
            } else if ("clickSignln".equals(testData.get(index))) {
                action.clickSignln(driver1);
            } else if ("closeBrowser".equals(testData.get(index))) {
                action.closeBrowser(driver1);
            }
        }
    }
}
