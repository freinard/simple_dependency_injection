package play;

public class UseIt {

    public static void main(String[] args) {
        Paths myPaths = new Paths();
        myPaths.setPath_one(onView(withId(R.id.user_name)));
//        myPaths.setPath_two(onView(withId(R.id.user_name)));
//        myPaths.setPath_three(onView(withId(R.id.user_name)));

        TopTest myTest = new TopTest(myPaths);
        myTest.run();
    }

    public static ActionableElement onView(Element e) {
        return new ActionableElement();
    }

    public static Element withId(String id) {
        return new Element();
    }

    public void typeText() {

    }

    private static class R {
        public static Identity id;
    }

    protected static class Identity {
        public static String user_name;
    }

    private static class Element{

    }

}


