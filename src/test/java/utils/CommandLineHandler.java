package utils;

import org.apache.commons.cli.*;

/**
 * Created by Kseniya_Kunda on 7/19/2017.
 */
public class CommandLineHandler {

    private CommandLineParser parser;
    private Options options;
    private CommandLine cmd;
    private static volatile CommandLineHandler handler;

    private static final String BROWSER = "browser";
    private static final String URL = "url";
    private static final String TESTNG_LIST = "testngList";

    private String browserName;
    private String url;
    private String[] testngFiles;

    private CommandLineHandler() {
        parser = new BasicParser();
        options = new Options();
    }

    public static CommandLineHandler getHandler(){
        if (handler == null){
            synchronized (CommandLineHandler.class){
                if (handler == null){
                    handler = new CommandLineHandler();
                }
            }
        }
        return handler;
    }

    private void setOptions() {
        options.addOption(BROWSER, true, "Browser has been chosen");
        options.addOption(URL, true, "URL has been chosen");
        options.addOption(TESTNG_LIST, true, "testngXml list has been chosen");
    }

    public void parseOptions(String[] args) {
        setOptions();
        try {
            cmd = parser.parse(options, args);
            browserName = cmd.getOptionValue(BROWSER);
            url = cmd.getOptionValue(URL);
            testngFiles = cmd.getOptionValue(TESTNG_LIST).replace(" ", "").split(",");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getBrowserName() {
        return browserName;
    }

    public String getUrl() {
        return url;
    }

    public String[] getTestngFileList() {
        return testngFiles;
    }
}
