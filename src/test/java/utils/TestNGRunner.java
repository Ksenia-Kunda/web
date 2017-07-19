package utils;

import org.testng.*;
import org.testng.collections.Lists;

import java.util.List;


/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class TestNGRunner {

    private TestNG testng;
    private List<String> suites;

    public TestNGRunner() {
        testng = new TestNG();
        suites = Lists.newArrayList();
    }

    public void runTestNg(String [] testNgFiles) {
        for (String testNgFile: testNgFiles) {
            suites.add(System.getProperty("user.dir") + testNgFile);
        }
        testng.setTestSuites(suites);
        testng.run();
    }
}
