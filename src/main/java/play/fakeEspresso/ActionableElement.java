package play.fakeEspresso;

public class ActionableElement {

    private final String id;

    public ActionableElement(String id) {
        this.id = id;
    }

    public void click() {
        print(id + " was clicked.");
    }

    public void perform(Action action) {
        print(action.getAction() + " was performed on " + id + " with " + action.getArgument());
    }

    public void print(String output) {
        System.out.println(output);
    }

    public String getId() {
        return id;
    }
}
