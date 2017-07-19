import utils.CommandLineHandler;
import utils.TestNGRunner;

/**
 * Created by Kseniya_Kunda on 7/18/2017.
 */
public class MainRunner {

    public static void main(String[] args) {
        CommandLineHandler handler = CommandLineHandler.getHandler();
        handler.parseOptions(args);
        new TestNGRunner().runTestNg(handler.getTestngFileList());
    }
}
