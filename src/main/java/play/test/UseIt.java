package play.test;

import play.fakeEspresso.ActionableElement;
import play.fakeEspresso.Element;
import play.fakeEspresso.R;

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

}


