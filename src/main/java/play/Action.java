package play;

public class Action {

    private final String action;
    private final String argument;

    public Action(String actionName, String arg1) {
        action = actionName;
        argument = arg1;
    }

    public String getAction() {
        return action;
    }

    public String getArgument() {
        return argument;
    }

}
