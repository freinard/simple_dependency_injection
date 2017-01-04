package play;

public class LogoutTest {

    private final Paths paths;

    public LogoutTest(Paths myPaths) {
        paths = myPaths;
    }

    public void run() {
        // execute logout sequence
        paths.getLogoutButton().click();
        // do some validation
    }

}
