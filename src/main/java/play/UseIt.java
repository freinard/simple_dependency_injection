package play;

public class UseIt {

    public static void main(String[] args) {
        Paths myPaths = new Paths();
        myPaths.setUsernameField(onView(withId(R.id.user_name)));
        myPaths.setPasswordField(onView(withId(R.id.password)));
        myPaths.setLoginButton(onView(withId(R.id.login_button)));
        myPaths.setLogoutButton(onView(withId(R.id.logout_button)));

        TopTest myTest = new TopTest(myPaths);
        myTest.run();
    }

    public static ActionableElement onView(Element e) {
        return new ActionableElement(e.getId());
    }

    public static Element withId(String id) {
        return new Element(id);
    }

    public void typeText() {

    }

    private static class R {
        public static Identity id;
    }

    protected static class Identity {
        public static String user_name = "username";
        public static String password = "password";
        public static String login_button = "loginBtn";
        public static String logout_button = "logoutBtn";
    }

    private static class Element{

        private final String id;

        public Element(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

}


