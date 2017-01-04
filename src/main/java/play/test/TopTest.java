package play.test;

public class TopTest {

    private final Paths paths;
    private final LoginTest loginTest;
    private final LogoutTest logoutTest;

    public TopTest(Paths myPaths) {
        paths = myPaths;
        loginTest = new LoginTest(myPaths);
        logoutTest = new LogoutTest(myPaths);
    }

    public void run() {
        loginTest.run();
        logoutTest.run();
    }
}
