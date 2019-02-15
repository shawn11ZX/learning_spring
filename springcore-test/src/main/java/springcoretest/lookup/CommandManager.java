package springcoretest.lookup;

public abstract class CommandManager {

    public int process() {
        // grab a new instance of the appropriate Command interface
        Command command = createCommand();
        // set the state on the (hopefully brand new) Command instance

        return command.getId();
    }

    // okay... but where is the implementation of this method?
    protected abstract Command createCommand();
}
