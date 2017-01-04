package play;

public class LoginTest {

    private final Paths paths;

    public LoginTest(Paths myPaths) {
        paths = myPaths;
    }

    public void run() {
        // execute login sequence
        paths.getUsernameField().perform(typeText("holiday"));
        paths.getPasswordField().perform(typeText("Titans00"));
        paths.getLoginButton().click();
        // do some validation
    }

    private Action typeText(String value){
        return new Action("typeText", value);
    }

}
