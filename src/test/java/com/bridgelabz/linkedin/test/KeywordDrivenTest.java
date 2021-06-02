package com.bridgelabz.linkedin.test;

import com.bridgelabz.linkedin.keyworddriven.KeywordEngine;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class KeywordDrivenTest {
    LinkedList<String> data = new LinkedList<>();
    @Test
    public void loginIntoApplication() {
        KeywordEngine engine = new KeywordEngine();
        data = engine.testData();
        engine.performActions(data);
    }
}
