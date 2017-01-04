package play;

public class Paths {

    private ActionableElement usernameField;
    private ActionableElement passwordField;
    private ActionableElement loginButton;
    private ActionableElement logoutButton;

    public ActionableElement getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(ActionableElement usernameField) {
        this.usernameField = usernameField;
    }

    public ActionableElement getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(ActionableElement passwordField) {
        this.passwordField = passwordField;
    }

    public ActionableElement getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(ActionableElement loginButton) {
        this.loginButton = loginButton;
    }

    public void setLogoutButton(ActionableElement logoutButton) {
        this.logoutButton = logoutButton;
    }

    public ActionableElement getLogoutButton() {
        return logoutButton;
    }
}
