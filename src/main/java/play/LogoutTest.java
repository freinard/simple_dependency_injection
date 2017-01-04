package play;

public class LogoutTest {

    private final Paths paths;

    public LogoutTest(Paths myPaths) {
        paths = myPaths;
    }

    public void run() {
        /*
        * Execute Logout test sequence
        * */

        paths.getPath_one().click("btnSubmit");

    }

}
